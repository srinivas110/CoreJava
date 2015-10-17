package com.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class QueueConsumer implements Runnable{

	private final BlockingQueue<String> queue;
	public QueueConsumer(BlockingQueue< String> blockingQueue){
		queue=blockingQueue;
	}
	
	@Override
	public void run() {
		while(!queue.isEmpty()){
			System.out.println("Consumer___"+queue.poll());
		}
	}
}
