package com.imooc.runnable;
class PrintRunnable implements Runnable {
	@Override
	public void run() {
		int i = 1;
		while (i <= 10)
			System.out.println(Thread.currentThread().getName() + " is running! " + (i++));
	}
}

class CatRunnable implements Runnable {
	@Override
	public void run() {
		for(int i=0; i < 3; i++)
			System.out.println(Thread.currentThread().getName() + "A cat");
	}
}

class DogRunnable implements Runnable {
	@Override
	public void run() {
		for(int i=0; i < 3; i++)
			System.out.println(Thread.currentThread().getName() + "A dog");
	}
}

public class Test {

	public static void main(String[] args) {
		PrintRunnable pr1 = new PrintRunnable();
		Thread t1 = new Thread(pr1);
		t1.start();
		PrintRunnable pr2 = new PrintRunnable();
		Thread t2 = new Thread(pr2);
		t2.start();
		
		for(int i=0; i < 3; i++) {
			System.out.println("main thread");
		}
		
		DogRunnable dogr = new DogRunnable();
		Thread t3 = new Thread(dogr);
		CatRunnable catr = new CatRunnable();
		Thread t4 = new Thread(catr);
		t3.start();
		t4.start();
	}

}
