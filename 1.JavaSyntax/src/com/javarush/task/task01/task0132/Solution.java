package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int x, y, z;
        x = number/100;
        number -= x*100;
        y = number/10;
        number-= y*10;
        z = number;
        return x+y+z;
    }
}