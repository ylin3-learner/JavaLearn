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
			
			System.out.println("消費：" + n);
			flag = false; // 消費完畢，容器中沒有數據
			notifyAll();  // 如果沒有這句, 兩個thread are in Runnable status 發生 deadlock
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
			System.out.println("生產：" + n);
			this.n = n;
			flag = true;  // 生產完畢，容器中已有數據
			notifyAll();
		}
		
		
}
