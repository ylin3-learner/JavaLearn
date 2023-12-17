package com.imooc;

import java.util.Scanner;

public class HelloJava {  // class name: Pascal style

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello! Java");
		String helloImooc ="hello Imooc";  // 駝峰命名法
		System.out.println(helloImooc);
//		float f = 123.438f;  // By default: 123.438 is double.
//		System.out.println("f="+f);
		
		double d = 5643.468;
		float f = 123;
		System.out.println("f="+f);
		
		// 如果字面值超出char 類型所表示的數據範圍，需要進行強制類型轉換
		char ch = (char) 65536;
		System.out.println("ch="+ch);
		// Unicode code - \\u + 4 digits
		char ch1 = '\u003a';
		System.out.println("ch1="+ch1);
		
		String s3 = "\u005a\u004c";
		System.out.println("s3="+s3);
		char s4 = 'c';
		System.out.println("\b"+s4+"\b");
		
		// long -> float
		float f1 = 104999990000L;
		System.out.println("f1="+f1);  // Precision lost
		double f2 = 1049999999999999999L;
		System.out.println("f2="+f2);  // Precision lost
		
		final double PI = 3.14;
//		PI = 5;
		System.out.println(PI);
		
		// string con-cat
		int num1 = 5, num2 = 10;
		System.out.println(num1+num2);  // num calculation
		System.out.println(""+num1+num2);  // string concat
		
		// Division -分母 denominator, 分子 numerator 都是整數 -> 商(整數)
		System.out.println(13/5);
		System.out.println(13/5.0);
		
		// x++
		int x = 4;
		int y = (x++) + 1;
		System.out.println("x="+x+", y="+y);
		
		// ++x
		y = (++x) + 1;
		System.out.println("x="+x+ ", y="+y);
		
		// Judge even or odd number
//		System.out.println("Please input integars:");
//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//		if (n% 2 == 0) {
//			System.out.println("This is even number.");
//		} else {
//			System.out.println("This is odd number.");
//		}
			// (y++) < 2 -- 先比較 後自增
			int s = 3; // & 就算為false 後面表達式也會運算
			boolean b = (3 > 7) & ((s++) < 3);
			System.out.println("s="+s+"\n"+"b="+b);
			
			int m = 3; // && 短路運算符 -- 只要前面為false 後面就不執行
			boolean b1 = (3 > 7) && ((m++) < 3);
			System.out.println("m="+m+"\n"+"b1="+b1);
			
			b = (3 < 7) | ((s++) < 3);
			System.out.println("s="+s);
			
			b1 = (3 < 7) || ((m++) < 3);  // || 短路運算符
			System.out.println("m="+m);
			
			int a = 10, c = 7;
			int max;
//			if (a > b) {
//				max = a;
//			} else {
//				max = b;
//			}
			max = a > c ? a : c;
			System.out.println("max="+max);
	}
}
