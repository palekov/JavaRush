package com.javarush.task.task01.task0140;

import java.util.Scanner;

/* 
Выводим квадрат числа
*/

public class Solution {
    public static void main(String[] args) {
        int a;
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        scan.close();
        System.out.print(a*a);
    }
}