package com.imooc.thread;
class MyThread extends Thread {
	// ��{�u�{ -- run()
	public void run() {
		System.out.println(getName() + "�u�{���b����!");
	}
}
public class ThreadTest {
		public static void main(String args[]) {
			System.out.println("�D�u�{1");
			MyThread mt = new MyThread();
			mt.start(); // �Ұʽu�{
			System.out.println("�D�u�{2");
		}
}
