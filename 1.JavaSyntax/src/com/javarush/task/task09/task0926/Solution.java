package com.javarush.task.task09.task0926;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> listok  = new ArrayList<>();
        int[] e1 = {1, 2, 3, 4, 5};
        int[] e2 = {1,2};
        int[] e3 = {1,2,3,4};
        int[] e4 = {1,2,3,4,5,6,7};
        int[] e5 = new int[0];
        listok.add(e1);
        listok.add(e2);
        listok.add(e3);
        listok.add(e4);
        listok.add(e5);
        return listok;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
