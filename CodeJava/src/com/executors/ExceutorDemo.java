package com.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExceutorDemo {

	public static void main(String[] args) {
		/*  ExecutorService executorService=Executors.newFixedThreadPool(4);
		 * the 4 threads are working parallel on 4 tasks and remaining  task would we in task queue
		once any thread work completed out of these 4 it will pick the task in queue and process it*/
		//ExecutorService executorService=Executors.newFixedThreadPool(4);
		
		/*
		 * ExecutorService executorService=Executors.newCachedThreadPool();
		 * 
		 * the newCachedThreadPool() doesn't maintain any queue'. based on tasks the threads will created
		 * 
		 * 
		 */
		//ExecutorService executorService=Executors.newCachedThreadPool();
		ExecutorService executorService=Executors.newSingleThreadExecutor();
		executorService.execute(new SampleTask());
		executorService.execute(new SampleTask());
		executorService.execute(new SampleTask());
		executorService.execute(new SampleTask());
		executorService.execute(new SampleTask());
		executorService.execute(new SampleTask());
		executorService.shutdown();
	}

}
