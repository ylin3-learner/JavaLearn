package com.imooc.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class BufferedFileIO {
	
	// write info file
	public static void  transWriteByBuf(String fileName, String content) {
		try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), StandardCharsets.UTF_8))) {
			// write content
			writer.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// read from file
	public static String transReadByBuf(String fileName) {
		StringBuilder content = new StringBuilder();
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8))) {
			String line;
			// Read line by line
			while((line = reader.readLine()) != null) {
				content.append(line).append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return content.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "temp.txt";
		String content = transReadByBuf(fileName);
		transWriteByBuf("helloJava.txt", content);
		System.out.println("Content read from file: " + content);
	}

}
