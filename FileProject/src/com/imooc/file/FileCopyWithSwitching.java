package com.imooc.file;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileCopyWithSwitching {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter the parent directory path: ");
            String sourcePath = reader.readLine();

            File source = new File(sourcePath);

            if (!source.exists()) {
                System.out.println("Source directory does not exist.");
                return;
            }

            System.out.print("Enter the destination directory path: ");
            String destinationPath = reader.readLine();

            File destination = new File(destinationPath);

            if (!destination.exists()) {
                if (!destination.mkdirs()) {
                    System.out.println("Failed to create destination directory.");
                    return;
                }
            }

            copyDirectory(source, destination);

            System.out.println("Copy completed successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copyDirectory(File source, File destination) throws IOException {
        if (source.isDirectory()) {
            if (!destination.exists()) {
                if (!destination.mkdir()) {
                    System.out.println("Failed to create destination directory.");
                    return;
                }
            }

            String[] files = source.list();

            if (files != null) {
                for (String file : files) {
                    File srcFile = new File(source, file);
                    File destFile = new File(destination, file);

                    copyDirectory(srcFile, destFile);
                }
            }
        } else {
            copyFileWithSwitching(source, destination);
        }
    }

    private static void copyFileWithSwitching(File source, File destination) throws IOException {
        try (InputStream inputStream = new FileInputStream(source);
             OutputStream outputStream = new FileOutputStream(destination)) {

            int bufferSize = 4096;
            byte[] buffer = new byte[bufferSize];

            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        }
    }
}

