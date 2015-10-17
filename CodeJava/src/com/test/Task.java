package com.test;

import java.util.Date;

public class Task implements Runnable{
	 private String name;
	 private Integer count=1;
	 
	    public Task(String name) {
	        this.name = name;
	    }
	     
	    public String getName() {
	        return name;
	    }
	    public Integer getCount() {
			return count++;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
		
	    @Override
	    public void run()
	    {
	        try {
	            System.out.println("Doing a task during : " + name + " - Time - " + new Date()+" --Count value--"+getCount());
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

		
}
