package com.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class BlockingQueueDemo {

	public static void main(String args[]) throws InterruptedException{
	BlockingQueue<String> queue=new ArrayBlockingQueue<String>(3);
	Thread t1=new Thread(new QueueProducer(queue));
	Thread t2=new Thread(new QueueConsumer(queue));
		t1.start();
		//t2.sleep(5000);
		t2.start();
	}

}
