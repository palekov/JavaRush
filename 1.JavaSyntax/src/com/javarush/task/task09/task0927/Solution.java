package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> mapik = new HashMap();
        Cat cat1 = new Cat("Vaska1");
        Cat cat2 = new Cat("Vaska2");
        Cat cat3 = new Cat("Vaska3");
        Cat cat4 = new Cat("Vaska4");
        Cat cat5 = new Cat("Vaska5");
        Cat cat6 = new Cat("Vaska6");
        Cat cat7 = new Cat("Vaska7");
        Cat cat8 = new Cat("Vaska8");
        Cat cat9 = new Cat("Vaska9");
        Cat cat10 = new Cat("Vaska10");
        mapik.put("Васька1", cat1);
        mapik.put("Васька2", cat2);
        mapik.put("Васька3", cat3);
        mapik.put("Васька4", cat4);
        mapik.put("Васька5", cat5);
        mapik.put("Васька6", cat6);
        mapik.put("Васька7", cat7);
        mapik.put("Васька8", cat8);
        mapik.put("Васька9", cat9);
        mapik.put("Васька10", cat10);
       return mapik;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        HashSet<Cat> ccc = new HashSet<>(map.values());
        return ccc;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
