package com.javarush.task.task13.task1318;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        Scanner scanner = new Scanner(new FileInputStream(reader.readLine()));
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            list.add(data);
        }
        list.forEach((str) -> System.out.println(str));
        scanner.close();
        reader.close();
    }
}