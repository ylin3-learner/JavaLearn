package com.imooc.queue;

public class Queue {
		private int n;
		
		boolean flag = false;
		
		public synchronized int getN() {
			if (!flag) {
				// flag == false
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println("���O�G" + n);
			flag = false; // ���O�����A�e�����S���ƾ�
			notifyAll();  // �p�G�S���o�y, ���thread are in Runnable status �o�� deadlock
			return n;
		}

		public synchronized void setN(int n) {
			if (flag) {
				// flag == true
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("�Ͳ��G" + n);
			this.n = n;
			flag = true;  // �Ͳ������A�e�����w���ƾ�
			notifyAll();
		}
		
		
}
