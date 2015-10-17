package com.executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

public class CallableClassTest {

	public static void main(String[] args) throws InterruptedException {
		final List<Future<String>> task;

		ExecutorService executorService = Executors.newFixedThreadPool(3);
		List<Callable<String>> lst = new ArrayList<Callable<String>>();
		lst.add(new CallableClass());
		lst.add(new CallableClass());
		lst.add(new CallableClass());
		//task = executorService.submit(new CallableClass());
		task = executorService.invokeAll(lst);
		try {
			 String str;

			// waits the 10 seconds for the Callable.call to finish.
			for (Future<String> callable : task) {
				str = callable.get();
				System.out.println(str);	
			}
			
		} catch (final InterruptedException ex) {
			ex.printStackTrace();
		} catch (final ExecutionException ex) {
			ex.printStackTrace();
		}
		executorService.shutdown();
	}

}
