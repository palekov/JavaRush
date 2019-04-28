package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> fixed = new ArrayList<String>();
        fixed.addAll(list);
        boolean containsR;
        boolean containsL;
        boolean containsRL;
        boolean f = true;
        int i = 0;
        String string;
        while (f){
            string = fixed.get(i);
            containsR = string.contains("р");
            containsL = string.contains("л");
            containsRL = containsR&containsL;
            if (!containsRL){
                if (containsL){
                    fixed.add(i+1,string);
                    i+=2;
                }
                else if (containsR){
                    fixed.remove(i);
                }
                else {
                    i+=1;
                }
            }
            else {
                i+=1;
            }
            if (i==fixed.size()) f=false;
        }
        return fixed;
    }
}