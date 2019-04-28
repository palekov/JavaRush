package com.javarush.task.task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws IOException {
        String fileName = args[0];
        int number = Integer.parseInt(args[1]);
        String text = args[2];
        String text1;
        byte b[] = new byte[text.length()];

        RandomAccessFile file = new RandomAccessFile(fileName, "rw");

        file.seek(number);
        file.read(b, 0, text.length());
    //    text1 = b.toString();
        text1 = convertByteToString(b);
        file.seek(file.length());
        if (text1.equals(text)) file.write("true".getBytes());
        else file.write("false".getBytes());
        file.close();
    }

    public static String convertByteToString(byte readBytes[])
    {
        return new String(readBytes);
    }
}
