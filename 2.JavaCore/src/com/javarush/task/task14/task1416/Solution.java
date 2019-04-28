package com.javarush.task.task14.task1416;

/* 
Исправление ошибок
*/

public class Solution {
    public static void main(String[] args) {
        OceanAnimal animal = new Orca();
        animal.swim();
        animal = new Whale();
        animal.swim();
        Otter otter = new Otter();
        animal.swim();
    }

    public static void test(Swimmable animal) {
        animal.swim();
    }

    interface Walkable {
        void walk();
    }

    interface Swimmable {
        void swim();
    }

    static abstract class OceanAnimal implements Swimmable {
        public void swim() {
            OceanAnimal currentAnimal = (OceanAnimal) getCurrentAnimal();
            currentAnimal.swimming();
        }

        private void swimming() {
            System.out.println(getCurrentAnimal().getClass().getSimpleName() + " is swimming");
        }

        abstract Swimmable getCurrentAnimal();
    }

    static class Orca extends OceanAnimal {

        @Override
        Swimmable getCurrentAnimal() {
            return null;
        }
    }

    static class Whale extends OceanAnimal {
        Swimmable getCurrentAnimal() {
            return null;
        }
    }

        static class Otter implements Swimmable, Walkable {
            public void swim() {
                System.out.println(" is swimming");
            }

            public void walk() {
                System.out.println(" is walking");
            }
        }
    }
