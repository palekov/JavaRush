package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
1. Создать 7 public полей класса. Убедитесь, что они инициализируются дефолтными значениями.
intVar типа int
doubleVar типа double
DoubleVar типа Double
booleanVar типа boolean
ObjectVar типа Object
ExceptionVar типа Exception
StringVar типа String
2. В методе main вывести их значения в заданном порядке.
*/

public class Solution {

    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;

    public static void main(String[] args) {

        Solution a = new Solution();

        System.out.println(a.intVar);
        System.out.println(a.doubleVar);
        System.out.println(a.DoubleVar);
        System.out.println(a.booleanVar);
        System.out.println(a.ObjectVar);
        System.out.println(a.ExceptionVar);
        System.out.println(a.StringVar);
    }
}