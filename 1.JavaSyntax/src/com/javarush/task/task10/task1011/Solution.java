package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        char[] x = s.toCharArray();
        int start = 0;
        for (int i = 0;i < 40;i++){

            for (int z = start;z < x.length;z++){
                System.out.print(x[z]);
            }
            start++;

            System.out.println();
        }
    }

}

