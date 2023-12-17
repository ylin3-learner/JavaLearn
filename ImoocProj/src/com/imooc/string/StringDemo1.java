package com.imooc.string;

public class StringDemo1 {

	public static void main(String[] args) {
		// Define a Java String "Java Coding basics"
		String str = "Java Coding basics";
		// PrintOut the length of str
		System.out.println("Length of str: " + str.length());
		
		// charAt(int index)
		// Locate "d" and print out
		System.out.println(str.charAt(7));
		
		// Substring
		System.out.println(str.substring(0, 12));
		
		// Define a string "Java Coding basics, I love java coding."
		String str1 = new String("JAVA Coding basics, I love JAVA Coding.");
		// Search where the first "A" appears
		System.out.println("the first A appears: " + str1.indexOf("A"));
		// Search where first "Coding" appears
		System.out.println("the first \"Coding\" appears: " + str1.indexOf("Coding"));
		
		// Search where the last "A" appears
		System.out.println("the first A appears: " + str1.lastIndexOf("A"));
		// Search where first "Coding" appears
		System.out.println("the last \"Coding\" appears: " + str1.lastIndexOf("Coding"));
		
		// String <-> Bytes = 8 bits
		String str2 = new String("Java Coding basics");
		// String -> Bytes -- P.S: Notice Charset should be the same when converting
		byte[] arrs = str2.getBytes();
		for(int i=0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
		
		System.out.println();
		// Bytes -> String
		String str3 = new String(arrs);
		System.out.println(str3);
		
		// == 和 equals 的區別
		str1 = "imooc";
		str2 = "imooc";
		str3 = new String("imooc");
		System.out.println("str1 和 str2 內容相同嗎? " + (str1.equals(str2)));
		System.out.println("str2 和 str3 內容相同嗎? " + (str2.equals(str3)));
		
		System.out.println("str1 和 str2 地址相同嗎? " + (str1 == str2));
		System.out.println("str2 和 str3 地址相同嗎? " + (str2 == str3));
	}

}
