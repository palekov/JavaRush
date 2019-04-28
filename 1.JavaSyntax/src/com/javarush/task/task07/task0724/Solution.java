package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {//напишите тут ваш код
        Human babusya1 = new Human("Anna", false, 71);//the creation Object "first grandmother"
        Human babusya2 = new Human("Lisa", false, 83);
        Human ded1 = new Human("Ivan", true, 76);
        Human ded2 = new Human("Mikel", true, 80);
        System.out.println(babusya1.toString());
        System.out.println(babusya2);
        System.out.println(ded1);
        System.out.println(ded2);
        Human mama = new Human("Miriam", false, 51, babusya1, ded1);//the creation Object "mama" using Objects "babusya1" and  "ded1"
        Human papa = new Human("Stas Mihailov", true, 46, babusya2, ded2);
        System.out.println(mama);
        System.out.println(papa);
        Human rebenok1 = new Human("Brezhneva", false, 31, mama, papa);//the creation Object "rebenok1" using Objects "mama" and  "papa"
        Human rebenok2 = new Human("Timberlake", true, 36, mama, papa);
        Human rebenok3 = new Human("Galkin", true, 27, mama, papa);
        System.out.println(rebenok1);
        System.out.println(rebenok2);
        System.out.println(rebenok3);
    }

    public static class Human {//напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father, mother;


        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;
            return text;}
    }
}





















