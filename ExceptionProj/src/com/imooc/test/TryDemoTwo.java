package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoTwo {
	
	public static void main(String[] args) throws Exception{
		try {
			int result = test();
			if (result < 18 || result > 80) {
				throw new HotelAgeException();
			}
			
			System.out.println("Quotient:"  + result);
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("InputMisMatchError");
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ZeroDivisionError");
		}
		

	}
	
	/*
	 * 1. throws 多種異常情況
	 * 2. throws Exception
	 */
	public static int test() throws ArithmeticException, InputMismatchException{
		Scanner scanner = new Scanner(System.in);
		System.out.println("========= Start Calculation ========");

		System.out.println("Please input the first int:");
		int one = scanner.nextInt();
		System.out.println("Please input the second int:");
		int two = scanner.nextInt();
		System.out.println("========= End Calculation ========");
		return one/two;
	}
}

