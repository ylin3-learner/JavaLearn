package com.imooc.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo2 {

	public static void main(String[] args) {
		// Create FileInputStream instance
		try {
			FileInputStream fileInStream = new FileInputStream("C:\\workspace\\FileProject\\fileText.txt");
			byte[] byteArray = new byte[20];
			fileInStream.read(byteArray);
			System.out.println(new String(byteArray));
			fileInStream.close();
		} catch (FileNotFoundException e) {   
			// FileNotFoundException is a sub-class of IOException, should be fronted.
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
