package com.ilearn.datamanager;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 從鍵盤接收整型數據存放到數組中，並對數組中的數據進行管理
 * @author user
 *
 */
public class DataManager {
/**
 * 從鍵盤接收數據	
 * @return 接收輸入的數據
 */
	public int[] insertData() {
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);
		// 少接收一個數據, 為在指定位置處插入數據做準備
		for (int i=0; i < a.length - 1; i++) {
			System.out.println("請輸入第"+(i+1)+"個數據>");
			// 處理輸入異常
			try {
				a[i] = sc.nextInt();
			} catch(java.util.InputMismatchException e) {
				System.out.println("輸入格式有誤, 不能有非數字!");
				sc.next();  // 接收不合法的輸入
				i--;  // 重新輸入
			}
		}
		return a;
	}
	/**
	 * 顯示數組中元素的內容
	 * @param a：數組
	 * @param length：要顯示的數組元素的個數
	 */
	public void showData(int[] a, int length) {
		for(int i=0; i < length; i++) {
			System.out.print(a[i]+"    ");
		}
		System.out.println();
	}
	/**
	 * 從鍵盤接收一個數據，插入到數組的指定位置處
	 * @param a: 要插入數據的數組
	 * @param num: 要插入的數據
	 * @param index:要插入的位置，從０開始
	 */
	public void insertAtArray(int[] a, int num, int index) {
		// 從最後一個數據開始移動, 避免數據覆蓋
		for (int i = a.length - 1; i > index; i--) {
			a[i] = a[i-1];
		}
		a[index] = num;
	}
	
	public void deleteAtArray(int[] a, int index) {
		a[index] = 0;
		for (int i = a.length - 1; i < index; i--) {
			a[i-1] = a[i];
		}
	}
	
	/**
	 * 輸出數組中能被3整除的元素
	 * @param a
	 */
	public void DivThree(int[] a) {
		String str = "";
		int count = 0; // count numbers
		for(int n: a) {
			if (n % 3 == 0) {
				str = str + n + "  ";
				count++;
			}
		}
		
		if (count == 0) {
			System.out.println("數組中沒有能被3整除的元素");
		} else {
			System.out.println("數組中能被3整除的元素為:" + str);
		}
	}
	
	/**
	 * 提示信息
	 */
	public void notice() {
		System.out.println("************************************************");
		System.out.println("                1-- 插入數據");
		System.out.println("                2-- 顯示所有數據");
		System.out.println("                3-- 在指定位置處插入數據");
		System.out.println("                4-- 查詢能被3整除的數據");
		System.out.println("                0-- 退出");
		System.out.println("*************************************************");
	}
	
	public static void main(String[] args) {
		DataManager dm = new DataManager();
		int input;
		int[] a = null;
		
		int n = 0, k = 0;  // n 為要插入的數據 ; k 為要插入的位置
		// 循環顯示
		while(true) {
			dm.notice();
			System.out.println("請輸入對應的數字進行操作>");
			
			Scanner sc = new Scanner(System.in);
			try {
				input = sc.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("輸入數據格式有誤, 不能有非數字!");
				sc.next();
				continue;
			}
			
			if(input == 0) {
				System.out.println("退出程序!");
				break;
			} 
			
			
			switch(input) {
			case 1:
				// 插入數據
				a = dm.insertData();
				// 顯示數據
				System.out.println("數組元素為：");
				dm.showData(a, a.length - 1);
				break;
			case 2:
				if (a != null) {
					System.out.println("數組元素為：");
					if (a[a.length -1 ] == 0) {
						// 如果數組的最後一個元素為0，尚未插入數據，不顯示最後一個元素
						dm.showData(a, a.length - 1);
					} else {
						dm.showData(a, a.length);
					}
				} else {
					System.out.println("還未在數組中插入數據，請重新選擇操作!");
				}
				break;
			case 3:
				// 在指定位置處插入數據
				if (a != null) {
					try {
						System.out.println("請輸入要插入的數據>");
						n = sc.nextInt();
						System.out.println("請輸入要插入數據的位置>");
						k = sc.nextInt();
					} catch(InputMismatchException e) {
						System.out.println("輸入數據格式有誤，不能是非數字!");
						sc.next();
						break;
					}
					
					dm.insertAtArray(a, n, k);
					dm.showData(a, a.length);
				} else {
					System.out.println("還未在數組中插入數據，請重新選擇操作!");
				}
				break;
			case 4:
				if (a != null) {
					// 查詢數組中能被3整除的元素
					dm.DivThree(a);
				} else {
					System.out.println("還未在數組中插入數據，請重新選擇操作!");
				}
				break;
			}
		}
	}

}
