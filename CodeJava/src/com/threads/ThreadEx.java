package com.threads;

public class ThreadEx implements Runnable {
    
	@Override
	public void run() {
		CommonObj obj=CommonObj.getObj();
		//obj.add(6);
		obj.saySomeMesg();
		
	}
   
    
}
