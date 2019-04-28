package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] doma = new int[15];
        int chet=0;
        int nechet=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int y =0; y<15; y++) {
            String s = reader.readLine();
            doma[y] = Integer.parseInt(s);
            if (y%2==0) chet = chet + doma[y]; else
                nechet = nechet + doma[y];
        }

        if (chet>nechet) System.out.print("В домах с четными номерами проживает больше жителей.");
            else System.out.print("В домах с нечетными номерами проживает больше жителей.");

    }
}
