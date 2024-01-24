package com.imooc.queue;

public class Customer implements Runnable {
	Queue queue;
	
	public Customer(Queue queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			queue.getN();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
