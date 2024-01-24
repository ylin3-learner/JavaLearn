package com.imooc.file;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteComparison {

    public static void main(String[] args) {
        // Define file path
        String oneFilePath = "one.txt";
        String twoFilePath = "two.txt";

        // Define Number of characters
        int numOfChars = 10000;

        // Use FileOutputStream to write one.txt
        long startTimeOne = System.currentTimeMillis();
        writeUsingFileOutputStream(oneFilePath, numOfChars);
        long endTimeOne = System.currentTimeMillis();
        long durationTimeOne = endTimeOne - startTimeOne;

        // Use BufferedOutputStream to write two.txt
        long startTimeTwo = System.currentTimeMillis();
        writeUsingBufferedOutputStream(twoFilePath, numOfChars);
        long endTimeTwo = System.currentTimeMillis();
        long durationTimeTwo = endTimeTwo - startTimeTwo;

        // Output the durations
        System.out.println("Time taken to write using FileOutputStream: " + durationTimeOne + " milliseconds");
        System.out.println("Time taken to write using BufferedOutputStream: " + durationTimeTwo + " milliseconds");
        System.out.println("Time save: " + (durationTimeOne - durationTimeTwo));
    }

    // Define writeUsingFileOutputStream()
    private static void writeUsingFileOutputStream(String filePath, int numOfChars) {
        try (FileOutputStream fos = new FileOutputStream(filePath)) {

            for (int i = 0; i < numOfChars; i++) {
                fos.write('a' + i % 26); // Write a single character from 'a' - 'z'
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        	System.out.println(filePath + "write Using FileOutputStream");
        }
    }

    // Define writeUsingBufferedOutputStream()
    private static void writeUsingBufferedOutputStream(String filePath, int numOfChars) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath))) {
            for (int i = 0; i < numOfChars; i++) {
                bos.write('a' + i % 26); // Write a single character from 'a' - 'z'
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        	System.out.println(filePath + "write Using BufferedOutputStream");
        }
    }
}
