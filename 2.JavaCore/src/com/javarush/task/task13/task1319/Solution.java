package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        // напишите тут ваш код
        String line="";
        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //      Scanner scanner = new Scanner(new FileOutputStream());

        line = reader.readLine();
        FileWriter outfile = new FileWriter(line);
        BufferedWriter filebuffer = new BufferedWriter(outfile);

        while (!line.equals("exit")) {
            line = reader.readLine();
            filebuffer.write(line);
            filebuffer.newLine();
        }
        reader.close();
        filebuffer.close();
    }
}