package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = null;
        try {
            string = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (string.equals(Planet.EARTH) || string.equals(Planet.MOON) || string.equals(Planet.SUN)) {
            if (string.equals(Planet.EARTH)) {
                thePlanet = Earth.getInstance();
            } else if (string.equals(Planet.MOON)) {
                thePlanet = Moon.getInstance();
            } else thePlanet = Sun.getInstance();
        } else thePlanet = null;

    }
}