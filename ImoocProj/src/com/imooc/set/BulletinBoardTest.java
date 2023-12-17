package com.imooc.set;
import java.util.ArrayList;
import java.util.Date;

import com.imooc.set.BulletinBoard;

public class BulletinBoardTest {
		
	public static void main(String[] args) {
		BulletinBoard board = new BulletinBoard(1, "�w��Ө�s�ͪ�", "�޲z��", new Date());
		BulletinBoard board1 = new BulletinBoard(2, "�Ы���ú��@�~", "�Ѯv", new Date());
		BulletinBoard board2 = new BulletinBoard(3, "�а��q��", "�Ѯv", new Date());
		
		// Add info
		ArrayList noticeList = new ArrayList();
		noticeList.add(board);
		noticeList.add(board1);
		noticeList.add(board2);
		
		// Print out info
		System.out.println("Board info: ");
		for(int i=0; i < noticeList.size(); i++) {
			System.out.println(i + 1 + ": " + ((BulletinBoard)(noticeList.get(i))).getTitle());
		}
		
		// Insert a new info behind the first info
		BulletinBoard board3 = new BulletinBoard(4, "�b�u�s�边�W�u", "�޲z��", new Date());
		noticeList.add(1, board3);
		
		System.out.println("Board info: ");
		for(int i=0; i < noticeList.size(); i++) {
			System.out.println(i + 1 + ": " + ((BulletinBoard)(noticeList.get(i))).getTitle());
		}
		
		// Delete info
		noticeList.remove(2);
		System.out.println("Board info: ");
		for(int i=0; i < noticeList.size(); i++) {
			System.out.println(i + 1 + ": " + ((BulletinBoard)(noticeList.get(i))).getTitle());
		}
		
		// Change info 1. Change title 2. 
		board3.setTitle("Java�b�u�s�边�W�u");
		noticeList.set(1, board3);
		System.out.println("Changed Board info: ");
		for(int i=0; i < noticeList.size(); i++) {
			System.out.println(i + 1 + ": " + ((BulletinBoard)(noticeList.get(i))).getTitle());
		}
	}
}
