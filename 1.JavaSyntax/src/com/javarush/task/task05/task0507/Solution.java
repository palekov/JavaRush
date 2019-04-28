package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        int i = 0, j =0, sum =0;
        while (i!=-1)  {
            i = scan.nextInt();
            if (i!=-1) {
                j++;
                sum +=i;
            }
        }
        System.out.println((double)sum/j);
    }
}

