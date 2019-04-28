package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        SpecialThread trd1 = new SpecialThread();
        SpecialThread trd2 = new SpecialThread();
        SpecialThread trd3 = new SpecialThread();
        SpecialThread trd4 = new SpecialThread();
        SpecialThread trd5 = new SpecialThread();

        Thread my1 = new Thread(trd1);
        Thread my2 = new Thread(trd2);
        Thread my3 = new Thread(trd3);
        Thread my4 = new Thread(trd4);
        Thread my5 = new Thread(trd5);

        list.add(my1);
        list.add(my2);
        list.add(my3);
        list.add(my4);
        list.add(my5);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
