package com.imooc.set;
import java.util.ArrayList;
import java.util.Date;

import com.imooc.set.BulletinBoard;

public class BulletinBoardTest {
		
	public static void main(String[] args) {
		BulletinBoard board = new BulletinBoard(1, "歡迎來到新生版", "管理員", new Date());
		BulletinBoard board1 = new BulletinBoard(2, "請按時繳交作業", "老師", new Date());
		BulletinBoard board2 = new BulletinBoard(3, "請假通知", "老師", new Date());
		
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
		BulletinBoard board3 = new BulletinBoard(4, "在線編輯器上線", "管理員", new Date());
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
		board3.setTitle("Java在線編輯器上線");
		noticeList.set(1, board3);
		System.out.println("Changed Board info: ");
		for(int i=0; i < noticeList.size(); i++) {
			System.out.println(i + 1 + ": " + ((BulletinBoard)(noticeList.get(i))).getTitle());
		}
	}
}
