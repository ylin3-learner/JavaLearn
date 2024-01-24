package com.imooc.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileInputStreamDemo {
		
		public static void main(String[] args) {
			// Create FileInputStream instance
			try {
				FileInputStream fileInStream = new FileInputStream("C:\\workspace\\FileProject\\fileText.txt");
//				int result = fileInStream.read();
//				while (result != -1) {
//					System.out.println((char) result);
//					result = fileInStream.read();
//				}
				int result = 0;
				int count = 0;
				while((result = fileInStream.read()) != -1) {
					System.out.print((char) result++);
					++count;
				}
				System.out.println("\nCount byte: "+ count);
				fileInStream.close();
			} catch (FileNotFoundException e) {   
				// FileNotFoundException is a sub-class of IOException, should be fronted.
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
}
