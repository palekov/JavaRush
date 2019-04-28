package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int corot = 99;
        int dlin = 0;
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int x = 0; x < 10; x++) {
            String s = reader.readLine();
            list.add(s);
            if (s.length() < corot) corot = s.length();
            if (s.length() > dlin) dlin = s.length();
        }
        for (int i = 0; i < list.size(); i++) {
            String t = list.get(i);
            if (t.length() == corot) {
                System.out.print(t);
                break;
            }
            if (t.length() == dlin) {
                System.out.print(t);
                break;
            }
        }
    }
}