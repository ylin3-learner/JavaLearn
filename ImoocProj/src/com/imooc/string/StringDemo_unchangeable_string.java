package com.imooc.string;

public class StringDemo_unchangeable_string {

	public static void main(String[] args) {
		// String 不可變性
		// String 一旦被創建, 則不可修改
		// 修改 == 創建了新的對象, 所指向的內存空間不變
		String s1 = "imooc";
		System.out.println("s1地址: " + System.identityHashCode(s1));
		s1 = "hello, " + s1;
		System.out.println("s1地址: " + System.identityHashCode(s1));
		// 賦值操作 ==> s1 不再指向"imooc", 而是指向了 "hello, imooc"
		System.out.println("s1 = " + s1);
		

	}

}
