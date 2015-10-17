package com.executors;

import java.util.concurrent.Callable;

public class CallableClass implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println("Result from Callable");
		return "Callable";
	}

}
