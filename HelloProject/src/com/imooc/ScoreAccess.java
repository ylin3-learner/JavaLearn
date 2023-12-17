package com.imooc;

import java.util.Scanner;

public class ScoreAccess {
	public static void main(String args[]) {
		System.out.println("Please input your score:");
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
//		if (score >= 90) {
//			System.out.print("優");
//		} else if (score >= 80) {   // else if (score >= 80) == if (score < 90 & score >= 80)
//			System.out.print("良");
//		} else if (score >= 60) {
//			System.out.print("中");
//		} else {
//			System.outprint("不及格");
//		}
		
		switch(score / 10) {
			case 9:
				System.out.print("優");
				break;
			case 8:   // else if (score >= 80) == if (score < 90 & score >= 80)
				System.out.print("良");
			case 7:
			case 6:
				System.out.print("中");
				break;
			default:
				System.out.print("不及格");
		}
	}
}
