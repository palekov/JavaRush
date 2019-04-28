package com.javarush.task.task32.task3201;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
Запись в существующий файл
*/
public class Solution {
    public static void main(String... args) throws IOException {
        String fileName = args[0];
        int number = Integer.parseInt(args[1]);
        String text = args[2];
        byte b[] = text.getBytes();

        RandomAccessFile file = new RandomAccessFile(fileName, "rw");

        if (file.length()>=number) {  file.seek(number); }  else
        {  file.seek(file.length());    }

        file.write(b);


    }
}
