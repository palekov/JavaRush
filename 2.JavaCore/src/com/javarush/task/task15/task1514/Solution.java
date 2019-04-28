package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(8.2, "String");
        labels.put(9.3, "tring");
        labels.put(10.4, "ring");
        labels.put(11.5, "ing");
        labels.put(12.6, "ng");
    }

    public static void main(String[] args) {

        {
            System.out.println(labels);
        }
    }
}