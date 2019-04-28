package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        FileInputStream file = new FileInputStream(str);
        int zpt = 0;
        while (file.available()>0) {
            int data = file.read();
            if (data==44)  zpt++;
        }
        file.close();
        System.out.print(zpt);
    }
}
