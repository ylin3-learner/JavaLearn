package com.imooc.thread;
class MyThread extends Thread {
	// 實現線程 -- run()
	public void run() {
		System.out.println(getName() + "線程正在執行!");
	}
}
public class ThreadTest {
		public static void main(String args[]) {
			System.out.println("主線程1");
			MyThread mt = new MyThread();
			mt.start(); // 啟動線程
			System.out.println("主線程2");
		}
}
