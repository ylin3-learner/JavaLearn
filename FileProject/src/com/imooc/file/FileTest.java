package com.imooc.file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		// Step 1: Create Monday.docx file
        File mondayFile = new File("File\\Monday.docx");
        
        // Ensure the directory exists -- getParentFile()
        File directory = mondayFile.getParentFile();
        if (!directory.exists()) {
            // Attempt to create the directory and its parent directories
            if (directory.mkdirs()) {  // mkdirs() -- create directory
                System.out.println("Directory created successfully: " + directory.getAbsolutePath());
                // getPath()
                /**
                 * get the file path in File's constructive method, which is the path string you wrote
                 */
            } else {
                System.out.println("Failed to create the directory");
            }
        }

        try {
            if (mondayFile.createNewFile()) {
                System.out.println("File created successfully");
                System.out.println("File Name: " + mondayFile.getName());
                System.out.println("Parent Directory: " + mondayFile.getParent());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 

        // Step 2: Check if the file exists and get its path or name
        if (mondayFile.exists()) {
            System.out.println("File exists");
            System.out.println("File Path: " + mondayFile.getAbsolutePath());
            System.out.println("File Name: " + mondayFile.getName());
        } else {
            System.out.println("File does not exist");
        }

        // Step 3: Check if it is a file or directory, and check readability and writability
        if (mondayFile.isFile()) {
            System.out.println("It is a file");

            // Check if the file is readable
            if (mondayFile.canRead()) {
                System.out.println("File is readable");
            } else {
                System.out.println("File is not readable");
            }

            // Check if the file is writable
            if (mondayFile.canWrite()) {
                System.out.println("File is writable");
            } else {
                System.out.println("File is not writable");
            }
        } else {
            System.out.println("It is a directory");
        }
	}

}
