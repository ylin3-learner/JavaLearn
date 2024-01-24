package com.imooc.file;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class ReaderDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("temp.txt");
			
			InputStreamReader reader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
			
			// 先用FileOutputStream 將文本讀入到OutputStreamWriter的字節數組中
			// OutputStreamWriter將字節轉成字符
			// 通過BufferedWriter 封裝 OutputStreamWriter 提高寫進的速度
			FileOutputStream fileOutputStream = new FileOutputStream("temp1.txt");  // 字符輸出流
			OutputStreamWriter writer = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
			BufferedWriter bfw = new BufferedWriter(writer);
			// 使用了StandardCharsets.UTF_8來指定UTF-8編碼
			// 缺陷：遇到不同的文件格式, 又會有亂碼
			/**
			 * 解決方式：使用帶有自動檢測編碼的庫，例如 Apache Commons IO 和 Juniversalchardet。
			 * 使用 Apache Commons IO 中的 BOMInputStream 來檢測並去除位元組順序標記(BOM)，以及使用 UniversalDetector 來自動檢測字元編碼
			 */
			int result = 0;
			char[] characterBuffer = new char[10];
			long startTime = System.currentTimeMillis();
//			while ((result = reader.read()) != -1) {
//				System.out.print((char) result);
//			}
			while((result = reader.read(characterBuffer)) != -1) {
				String characterString = new String(characterBuffer, 0, result);
				bfw.write(characterString);
				bfw.flush();
				System.out.print(characterString);
			}
			long endTime = System.currentTimeMillis();
			
			fileInputStream.close();
			reader.close();
			fileOutputStream.close();
			writer.close();
			bfw.close();
			System.out.println("\nDuration Time: " + (endTime - startTime));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
