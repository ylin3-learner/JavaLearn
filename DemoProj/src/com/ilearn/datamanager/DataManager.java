package com.ilearn.datamanager;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * �q��L�����㫬�ƾڦs���Ʋդ��A�ù�Ʋդ����ƾڶi��޲z
 * @author user
 *
 */
public class DataManager {
/**
 * �q��L�����ƾ�	
 * @return ������J���ƾ�
 */
	public int[] insertData() {
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);
		// �ֱ����@�Ӽƾ�, ���b���w��m�B���J�ƾڰ��ǳ�
		for (int i=0; i < a.length - 1; i++) {
			System.out.println("�п�J��"+(i+1)+"�Ӽƾ�>");
			// �B�z��J���`
			try {
				a[i] = sc.nextInt();
			} catch(java.util.InputMismatchException e) {
				System.out.println("��J�榡���~, ���঳�D�Ʀr!");
				sc.next();  // �������X�k����J
				i--;  // ���s��J
			}
		}
		return a;
	}
	/**
	 * ��ܼƲդ����������e
	 * @param a�G�Ʋ�
	 * @param length�G�n��ܪ��Ʋդ������Ӽ�
	 */
	public void showData(int[] a, int length) {
		for(int i=0; i < length; i++) {
			System.out.print(a[i]+"    ");
		}
		System.out.println();
	}
	/**
	 * �q��L�����@�ӼƾڡA���J��Ʋժ����w��m�B
	 * @param a: �n���J�ƾڪ��Ʋ�
	 * @param num: �n���J���ƾ�
	 * @param index:�n���J����m�A�q���}�l
	 */
	public void insertAtArray(int[] a, int num, int index) {
		// �q�̫�@�Ӽƾڶ}�l����, �קK�ƾ��л\
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
	 * ��X�Ʋդ���Q3�㰣������
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
			System.out.println("�Ʋդ��S����Q3�㰣������");
		} else {
			System.out.println("�Ʋդ���Q3�㰣��������:" + str);
		}
	}
	
	/**
	 * ���ܫH��
	 */
	public void notice() {
		System.out.println("************************************************");
		System.out.println("                1-- ���J�ƾ�");
		System.out.println("                2-- ��ܩҦ��ƾ�");
		System.out.println("                3-- �b���w��m�B���J�ƾ�");
		System.out.println("                4-- �d�߯�Q3�㰣���ƾ�");
		System.out.println("                0-- �h�X");
		System.out.println("*************************************************");
	}
	
	public static void main(String[] args) {
		DataManager dm = new DataManager();
		int input;
		int[] a = null;
		
		int n = 0, k = 0;  // n ���n���J���ƾ� ; k ���n���J����m
		// �`�����
		while(true) {
			dm.notice();
			System.out.println("�п�J�������Ʀr�i��ާ@>");
			
			Scanner sc = new Scanner(System.in);
			try {
				input = sc.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("��J�ƾڮ榡���~, ���঳�D�Ʀr!");
				sc.next();
				continue;
			}
			
			if(input == 0) {
				System.out.println("�h�X�{��!");
				break;
			} 
			
			
			switch(input) {
			case 1:
				// ���J�ƾ�
				a = dm.insertData();
				// ��ܼƾ�
				System.out.println("�Ʋդ������G");
				dm.showData(a, a.length - 1);
				break;
			case 2:
				if (a != null) {
					System.out.println("�Ʋդ������G");
					if (a[a.length -1 ] == 0) {
						// �p�G�Ʋժ��̫�@�Ӥ�����0�A�|�����J�ƾڡA����̫ܳ�@�Ӥ���
						dm.showData(a, a.length - 1);
					} else {
						dm.showData(a, a.length);
					}
				} else {
					System.out.println("�٥��b�Ʋդ����J�ƾڡA�Э��s��ܾާ@!");
				}
				break;
			case 3:
				// �b���w��m�B���J�ƾ�
				if (a != null) {
					try {
						System.out.println("�п�J�n���J���ƾ�>");
						n = sc.nextInt();
						System.out.println("�п�J�n���J�ƾڪ���m>");
						k = sc.nextInt();
					} catch(InputMismatchException e) {
						System.out.println("��J�ƾڮ榡���~�A����O�D�Ʀr!");
						sc.next();
						break;
					}
					
					dm.insertAtArray(a, n, k);
					dm.showData(a, a.length);
				} else {
					System.out.println("�٥��b�Ʋդ����J�ƾڡA�Э��s��ܾާ@!");
				}
				break;
			case 4:
				if (a != null) {
					// �d�߼Ʋդ���Q3�㰣������
					dm.DivThree(a);
				} else {
					System.out.println("�٥��b�Ʋդ����J�ƾڡA�Э��s��ܾާ@!");
				}
				break;
			}
		}
	}

}
