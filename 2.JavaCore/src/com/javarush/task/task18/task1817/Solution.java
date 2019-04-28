package com.javarush.task.task18.task1817;

/* 
Пробелы
*/


import java.io.FileInputStream;

import java.io.IOException;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(String.valueOf(args[0]));

        int probel = 0, total = 0;
     //   double rezult;

        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
            char data = (char) inputStream.read(); //прочитать очередной байт
            if (data ==' ')  probel++; //else
               total ++;
        }
        inputStream.close(); // закрываем поток

        //  rezult = (probel / total) * 100;
     //   System.out.printf("%8.2f", rez); //выводим сумму на экран. "%8.2f"
        System.out.println(String.format(Locale.ENGLISH,"%.2f", (double) probel / total * 100.0));
    }
}

