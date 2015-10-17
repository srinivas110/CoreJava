package com.executors;

public class SampleTask implements Runnable{
	
	private static int count=0;
	private int id;
	private  int sum=0;
	
	public SampleTask(){
		id=++count;
	}

	@Override
	public void run() {
		System.out.println("Started Task-->"+id);
		for(int i=5;i>0;i--){
			sum+=i;
		System.out.println("Tic Tic-->Thread--running "+id+"--loop value--"+i);
		}
	    System.out.println("Ended Task-->"+id);
	    System.out.println("Count value in sum-->"+sum);
	}

}
