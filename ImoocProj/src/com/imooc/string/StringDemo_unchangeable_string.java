package com.imooc.string;

public class StringDemo_unchangeable_string {

	public static void main(String[] args) {
		// String ���i�ܩ�
		// String �@���Q�Ы�, �h���i�ק�
		// �ק� == �ЫؤF�s����H, �ҫ��V�����s�Ŷ�����
		String s1 = "imooc";
		System.out.println("s1�a�}: " + System.identityHashCode(s1));
		s1 = "hello, " + s1;
		System.out.println("s1�a�}: " + System.identityHashCode(s1));
		// ��Ⱦާ@ ==> s1 ���A���V"imooc", �ӬO���V�F "hello, imooc"
		System.out.println("s1 = " + s1);
		

	}

}
