package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream origin_fis;
    public AmigoOutputStream(FileOutputStream fis) throws FileNotFoundException {
        super(fileName);
        this.origin_fis = fis;
    }
    public void write(int b) throws IOException {
        origin_fis.write(b);
    }

    public void write(byte[] b) throws IOException {
        origin_fis.write(b);

    }

    public void write(byte[] b, int off, int len) throws IOException {
        origin_fis.write(b, off, len);
    }

    public void flush() throws IOException {
        origin_fis.flush();

    }
    public void close() throws IOException {
        origin_fis.flush();
        origin_fis.write("JavaRush © All rights reserved.".getBytes());
        origin_fis.close();

    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
