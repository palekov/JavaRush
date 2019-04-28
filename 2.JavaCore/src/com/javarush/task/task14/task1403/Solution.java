package com.javarush.task.task14.task1403;

/* 
Building и School
*/

public class Solution {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {
        //измените null на объект класса Building или School
        School scl = new School();
        return scl;
    }

    public static Building getBuilding() {
        //измените null на объект класса Building или School
        Building bld = new Building();
        return bld;
    }

    static class School extends Building/*Добавьте сюда ваш код*/ {
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building /*Добавьте сюда ваш код*/ {
        @Override
        public String toString() {
            return "Building";
        }
    }
}
