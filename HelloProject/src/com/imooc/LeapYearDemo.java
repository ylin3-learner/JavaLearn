package com.imooc;

import java.util.Scanner;

public class LeapYearDemo {
	public static void main(String[] args) {
		System.out.println("Please input year:");
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		// leap year: divide by 4 but not by 100 and divide by 400
		if ( ( (year %4 == 0) & (year % 100 != 0)) | (year % 400 == 0)) {
			System.out.println("This year " + year + " is a leap year." );
		} else {
			System.out.println("This year " + year + " isn't a leap year." );
		}
		
		int x = 3;
		int y = (x++) + 4;  // ���Ѥ��B��,�b�ۼW
		System.out.println("y="+y);
		
		int x1 = 3;
		int y1 = (++x1) + 4;  // ���ۼW, ��ѻP�B��
		System.out.println("y1="+y1);
	}
}

