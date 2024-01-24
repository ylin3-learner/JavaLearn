package com.imooc.file;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Compare byteArrayOutputStream Vs. BufferedOutputStream

/**\
 * ByteArrayOutputStream:
 * when you know that you have some data that in the end you need as array of bytes
 * BufferedOutputStream:
 * a wrapper around any other kind of output stream - which adds buffering.
 * A different behavior: create a buffered one that writes to a file, and an array one. Then just keep pushing bytes into each one. The array one will cause a memory problem at some point, the other one might not stop until all of your disk space is used up.
 * @author user
 *
 *The ByteArrayOutputStream writes data to an in-memory byte array, and since it doesn't have the constraints of physical disk space, it can continue writing until it runs out of heap space.
 *On the other hand, the BufferedOutputStream writes data to a file (buffered_output.txt). The operating system's file system constraints, combined with available disk space, determine when the writing process will stop. In this case, it ran for 49801 milliseconds before encountering an out-of-space condition.
 */

public class ByteArrayOutputStreamComparison {

    public static void main(String[] args) {
        // File path for BufferedOutputStream
        String bufferedFilePath = "buffered_output.txt";

        // Create a BufferedOutputStream to write to a file
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(bufferedFilePath))) {
            long startTimeBuffered = System.currentTimeMillis();
            writeUsingBufferedOutputStream(bufferedOutputStream);
            long endTimeBuffered = System.currentTimeMillis();
            long durationBuffered = endTimeBuffered - startTimeBuffered;
            System.out.println("Time taken to write using BufferedOutputStream: " + durationBuffered + " milliseconds");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create a ByteArrayOutputStream
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        // Create a thread to write to the ByteArrayOutputStream
        Thread byteArrayThread = new Thread(() -> {
            long startTimeByteArray = System.currentTimeMillis();
            writeUsingByteArrayOutputStream(byteArrayOutputStream);
            long endTimeByteArray = System.currentTimeMillis();
            long durationByteArray = endTimeByteArray - startTimeByteArray;
            System.out.println("Time taken to write using ByteArrayOutputStream: " + durationByteArray + " milliseconds");
        });

        // Start the thread
        byteArrayThread.start();
    }

    private static void writeUsingBufferedOutputStream(BufferedOutputStream bos) {
        try {
            // Keep writing bytes until memory is exhausted
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                bos.write('a');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeUsingByteArrayOutputStream(ByteArrayOutputStream bos) {
        try {
            // Keep writing bytes until memory is exhausted
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                bos.write('a');
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory error: " + e.getMessage());
        }
    }
}
