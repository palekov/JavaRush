package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    public Circle() { this(1,1,1); }

    public Circle( double x, double y, double radius)  {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public Circle(double x, double y)  {
        this.x = x;
        this.y = y;
        radius =1;
    }

    public Circle(double radius)  {
        this.radius = radius;
        x = 1;
        y = 1;
    }

    public static void main(String[] args) {

    }
}