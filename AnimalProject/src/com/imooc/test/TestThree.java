package com.imooc.test;

import com.imooc.animal.Animal;

public class TestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal one = new Animal("���", 2);
		Animal two = new Animal("���", 2);
		
		/** equals ����
		 *  1. equals ���աG�~��object����equals��k�ɡA������O��ӤޥάO�_���V�P�@�ӹ�H
		 *  2. �l���i�H�q�L���gequals ��k���Φ�, ���ܤ�������e
		 */
		boolean flag = one.equals(two);
		System.out.println("one �M two ������G" + flag);
		System.out.println("one �M two ������G" + (one == two));
		System.out.println("==============================");
		String str1 = new String("hello");
		String str2 = new String("hello");
		flag = str1.equals(str2);
		System.out.println("str1 �M str2 ������G" + flag);
		System.out.println("str1 �M str2 ������G" + (str1 == str2));
		System.out.println("==============================");
		
		/** toString ����
		 *  1. ��X��H�W��, �q�{�|�����ե�������toString
		 *  2. �~��object����toString�ɡA��X���O�G���W�H�� + @ + �a�}�H��
		 *  3. �l���i�H�q�L���gtoString ��k���Φ�, ���ܿ�X�����e�Ϊ�{����
		 */
		System.out.println(one.toString());
		System.out.println(one);
		System.out.println("==============================");
		System.out.println(str1);
	}

}
