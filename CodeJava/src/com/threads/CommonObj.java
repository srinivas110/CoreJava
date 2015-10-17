package com.threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CommonObj {

	protected int synCount = 0;
	protected int locCount = 0;
	private Lock lock;
	private static CommonObj obj = new CommonObj();

	public static CommonObj getObj() {

		if (obj == null) {
			obj = new CommonObj();
			System.out.println("Object created");
		}

		return obj;
	}

	// example using synchronized block
	public void add(int value) {

		synchronized (this) {
			synCount += value;
			System.out.println("count value in  synchronized---->" + synCount);
		}

	}

	// example using Lock
	public void addValue(int value) {
		lock = new ReentrantLock();
		try {
			if (lock.tryLock(10, TimeUnit.SECONDS)) {
				locCount += value;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			// release lock
			lock.unlock();
		}
		/*
		 * lock.lock(); locCount += value; lock.unlock();
		 */
		System.out.println("count value in Lock---->" + locCount);
		//saySomeMesg();
	}

	public void saySomeMesg() {
		System.out.println("Inside saySomeMesg"+(++locCount));

	}

	public int getFinalSynCount() {
		return synCount;
	}

	public int getFinalLocCount() {
		return locCount;
	}
	

}
