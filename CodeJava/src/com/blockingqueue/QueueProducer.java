package com.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class QueueProducer implements Runnable {
   private final BlockingQueue<String> queue;
	public QueueProducer(BlockingQueue< String> blockingQueue){
		queue=blockingQueue;
	}
	
	@Override
	public void run() {
		while(queue.isEmpty()){
			try {
				queue.put("ABC in QueueProducer");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	

}
