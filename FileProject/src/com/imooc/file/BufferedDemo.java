package com.imooc.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("2_copy.jpg");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			FileInputStream fis = new FileInputStream("C:\\workspace\\FileProject\\src\\com\\imooc\\file\\1.jpg");
			BufferedInputStream bis = new BufferedInputStream(fis);
			long startTime = System.currentTimeMillis();
			int result = 0;
			byte[] byteArray = new byte[1024];
			while((result = bis.read(byteArray)) != -1 ) {
				bos.write(byteArray, 0, result);
			}
			bos.flush();
			long endTime = System.currentTimeMillis();
			System.out.println("Time cost: " + (endTime-startTime));
			fos.close();
			fis.close();
			bis.close();
			bos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
