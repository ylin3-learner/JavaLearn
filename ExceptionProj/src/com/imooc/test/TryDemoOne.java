package com.imooc.test;

import java.rmi.AccessException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoOne {

	public static void main(String[] args) {
		// Declare two int and get their quotient
		/*
		int one = 12, two = 2;
		System.out.println("Quotient:"  + (one/two));
		*/
		int result = test();
		System.out.println("Quotient:"  + result);
	}
	
	// Accept two user-input int
	public static int test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("========= Start Calculation ========");
		try {
			System.out.println("Please input the first int:");
			int one = scanner.nextInt();
			System.out.println("Please input the second int:");
			int two = scanner.nextInt();
			return one/two;
		} catch (ArithmeticException e) {
			System.exit(1);  // Terminate the program
			e.printStackTrace();
			System.out.println("ZeroDivisionError");
		}  catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("請輸入整數"); 
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Program goes wrong"); 
			return 0;
		}  finally {
			System.out.println("========= End Calculation ========");
			return -10000000;
		}
	}

}
