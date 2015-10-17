package com.threads;

public class ThreadEy implements Runnable{

	@Override
	public void run() {
		CommonObj obj=CommonObj.getObj();
		//obj.add(5);
		obj.saySomeMesg();
	}

}
