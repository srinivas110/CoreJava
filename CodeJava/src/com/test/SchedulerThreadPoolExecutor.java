package com.test;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerThreadPoolExecutor {
	
	 public static void main(String[] args)
	    {
	        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
	        Task task1 = new Task ("Demo Task 1");
	        Task task2 = new Task ("Demo Task 2");
	         
	        System.out.println("The time is : " + new Date());
	         
	        executor.scheduleAtFixedRate(task1, 2 ,2 ,TimeUnit.SECONDS);
	       // executor.scheduleAtFixedRate(task2, 5 ,5, TimeUnit.SECONDS);
	        executor.scheduleWithFixedDelay(task2, 3, 1, TimeUnit.SECONDS);
	       // executor.
	       // executor.shutdown();
	         
	        try {
	              //executor.awaitTermination(1, TimeUnit.DAYS);
	        	TimeUnit.MILLISECONDS.sleep(20000);
	        } catch (InterruptedException e) {
	              e.printStackTrace();
	        }
	         
	        executor.shutdown();
	    }

}
