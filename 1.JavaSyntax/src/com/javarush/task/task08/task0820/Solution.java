package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
Множество всех животных
*/


public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        HashSet<Dog> resultDog = new HashSet<Dog>();

        resultDog.add(new Dog());
        resultDog.add(new Dog());
        resultDog.add(new Dog());

        return resultDog;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set <Object> pets = new HashSet<Object>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (int i=0; i<pets.size();i++)
        {
            System.out.println(pets);
        }
    }

    //напишите тут ваш код
    public static class Cat
    {

    }
    public static class Dog
    {

    }

}