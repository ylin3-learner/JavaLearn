package com.imooc;

import java.util.Scanner;

public class ScoreAccess {
	public static void main(String args[]) {
		System.out.println("Please input your score:");
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
//		if (score >= 90) {
//			System.out.print("�u");
//		} else if (score >= 80) {   // else if (score >= 80) == if (score < 90 & score >= 80)
//			System.out.print("�}");
//		} else if (score >= 60) {
//			System.out.print("��");
//		} else {
//			System.outprint("���ή�");
//		}
		
		switch(score / 10) {
			case 9:
				System.out.print("�u");
				break;
			case 8:   // else if (score >= 80) == if (score < 90 & score >= 80)
				System.out.print("�}");
			case 7:
			case 6:
				System.out.print("��");
				break;
			default:
				System.out.print("���ή�");
		}
	}
}
