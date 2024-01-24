package com.imooc.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	
		public static void main(String args[]) {
			// Create File instance (absolute path) -- (root path/ sub path)
			// File file = new File("‪‪C:\\workspace\\FileProject\\fileText.txt");
			File file = new File("C:\\workspace", "\\FileProject\\fileText.txt");
			// File file = new File("‪C:\\workspace");
			// File file1 = new File(file, "\\FileProject\\fileText.txt");
			
			// Check isFile or isDirectory
			System.out.println("IsFile: " + file.isFile());
			System.out.println("IsDirectory: " + file.isDirectory());
			
			// Create Directory
			File file1 = new File("C:\\workspace", "\\FileProject\\fileDemo");
			if (!file1.exists()) {
				file1.mkdir();
				// Mulitiple levels -- mkdirs()
			} else {
				System.out.println("Already exists");
			}
			
			// Create File
			if(!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("Already exists");
			}
		}
}
