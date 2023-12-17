package com.imooc;

public class IntCompare {

	public static void main(String[] args) {
		int x = 10, y = 5;
		
		if (x != y) {
			if (x > y) {
				System.out.print(x+" larger "+y);
			} else {
				System.out.print(x+" smaller "+y);
			}
		} else {
			System.out.print("x="+x+"equals to y="+y);
		}
	}
	
	// Notice: brackets {} is pretty important for your systematic logic.
	/* 
	 * if (x != y) 
			if (x > y) 
				System.out.print(x+" larger "+y);
		else 
				System.out.print(x+" smaller "+y);
		
		Actually, else statement here matches with if (x > y) not if (x != y) -- the nearest if statement
	 * */
}
