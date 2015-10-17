package com.threads;

public class ThreadExTest {

	public static void main(String[] args) throws InterruptedException {
		//CommonObj ob=new CommonObj();
		ThreadEx ex=new ThreadEx();
		ThreadEy ey=new ThreadEy();
		//ThreadEx ex1=new ThreadEx();
		//ex.add(2);
		//ex.add(3);
		Thread t1=new Thread(ex);
		Thread t2=new Thread(ey);
		Thread t3=new Thread(ex);
		Thread t4=new Thread(ey);
		t1.start();
		//Thread.sleep(2000);
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		t4.start();
		//Thread.sleep(2000);
		//System.out.println("Final Count Syn--->"+CommonObj.getObj().getFinalSynCount());	
		//System.out.println("Final Count Loc--->"+CommonObj.getObj().getFinalLocCount());

	}

}
