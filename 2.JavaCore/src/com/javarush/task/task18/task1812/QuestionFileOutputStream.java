package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream origin;
    public QuestionFileOutputStream(AmigoOutputStream ami)  {
        this.origin = ami;
    }
    public void flush() throws IOException  {
        origin.flush();
    }

    public void write(int b) throws IOException  {
        origin.write(b);
    }

    public void write(byte[] b) throws IOException  {
        origin.write(b);
    }

    public void write(byte[] b, int off, int len) throws IOException   {
        origin.write(b, off, len);
    }

    public void close() throws IOException   {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;
        String s = reader.readLine();
      //  int i = Integer.parseInt(s);
        if (s.equals("Д")) {
            origin.close();
        }
    }
}

