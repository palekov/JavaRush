package com.javarush.task.task14.task1421;

/**
 * Created by Sashkus on 22.04.2018.
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance()  {
        return instance;
    }
}
