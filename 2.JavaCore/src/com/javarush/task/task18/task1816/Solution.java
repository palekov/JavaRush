package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;

import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(String.valueOf(args[0]));

        int english = 0;

        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
            char data = (char) inputStream.read(); //прочитать очередной байт
            if ((( data >=0x0041)&&(data <=0x005A))||(((data >= 0x0061)&&(data <=0x007A ))) )  english++;
        }
        inputStream.close(); // закрываем поток

        System.out.println(english); //выводим сумму на экран.
    }
}
