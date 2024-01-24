package com.imooc.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		// Create File instance
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("1_copy.jpg");
			FileInputStream fileInputStream = new FileInputStream("C:\\workspace\\FileProject\\src\\com\\imooc\\file\\1.jpg");
			int result = 0;
			byte[] byteArray = new byte[1024];
			long startTime = System.currentTimeMillis();
			while((result = fileInputStream.read(byteArray)) != -1 ) {
				fileOutputStream.write(byteArray, 0, result);
			}
			long endTime = System.currentTimeMillis();
			System.out.println("Time cost: " + (endTime-startTime));
			fileInputStream.close();
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
