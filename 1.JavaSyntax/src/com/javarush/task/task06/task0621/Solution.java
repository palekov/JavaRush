package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamCorruptedException;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String g_fatherName = reader.readLine();
        Cat catG_father = new Cat(g_fatherName, null, null);

        String g_motherName = reader.readLine();
        Cat catG_mother = new Cat(g_motherName, null , null);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catG_father);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catG_mother, null);

        String sonnerName = reader.readLine();
        Cat catSonner = new Cat(sonnerName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catG_father);
        System.out.println(catG_mother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSonner);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat parentman;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent, Cat parentman) {
            this.name = name;
            this.parent = parent;
            this.parentman = parentman;
        }

        @Override
        public String toString() {
            if ((parent == null)&&(parentman == null))
                return "Cat name is " + name + ", no mother, no father ";
            if (parentman == null)
                return "Cat name is " + name + ", mother is " + parent.name + ", no father ";
            if (parent == null)
                return "Cat name is " + name + ", no mother, father is " + parentman.name;

            return "Cat name is " + name + ", mother is " + parent.name + ", father is " + parentman.name;
        }
    }

}
