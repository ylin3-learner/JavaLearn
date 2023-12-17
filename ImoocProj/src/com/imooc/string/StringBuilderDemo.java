package com.imooc.string;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// Define a string "hello"
		StringBuilder str = new StringBuilder("hello");
		System.out.println(System.identityHashCode(str));
//		str.append(", imooc");
//		System.out.println(str);
		System.out.println(str.append(',').append("imooc"));
		System.out.println(System.identityHashCode(str));
		
		// Turn str into "hello, IMOOC"
		// Two way:
		// 1. Delete imooc, Insert IMOOC
		System.out.println("´À´««á: " + str.delete(6, 11).insert(6, "IMOOC"));
		// 2. Replace
		System.out.println("´À´««á: " + str.replace(6, 11, "IMOOC"));
		
		// Substring "hello"
		System.out.println(str.substring(0, 5));
	}
}

