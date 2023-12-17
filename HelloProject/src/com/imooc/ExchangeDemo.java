package com.imooc;

public class ExchangeDemo {
	// Modify the element of array
	public void updateArray(int[] a) {
		System.out.println("\nIn updateArrayTest(); Before Update: ");
		a[3] = 15;
		for(int n: a) {
			System.out.print(n+"   ");
		}
		System.out.println();
		System.out.println("In updateArrayTest(); After Update: ");
	}
	
	public void updateArrayTest() {
		int a[] = {1, 2, 3, 4, 5};
		System.out.println("In Main(); Before Update: ");
		for(int n: a) {
			System.out.print(n+"   ");
		}
		updateArray(a);
		System.out.println("In Main(); After Update: ");
		for(int n: a) {
			System.out.print(n+"   ");
		}
	}
	
	// Switch two value
	public void swap(int first, int second) {
		int temp;
		System.out.println("In Swap(); Before Exchange: "+"a= "+first+", b= "+second);
		temp = first; first = second; second = temp;
		System.out.println("In Swap(); After Exchange: "+"a= "+first+", b= "+second);
	}
	
	// Encapsulation «Ê¸Ë
	public void swapTest() {
		int first = 3, second = 5;
		System.out.println("In Main(); Before Exchange: "+"a= "+first+", b= "+second);
		swap(first, second);
		System.out.println("In Main(); After Exchange: "+"a= "+first+", b= "+second);
	}
	
	public static void main(String[] args) {
		ExchangeDemo ED = new ExchangeDemo();
		ED.swapTest();
		System.out.println();
		ED.updateArrayTest();
		
	}

}
