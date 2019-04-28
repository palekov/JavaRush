package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int i = Integer.parseInt(s);
        reader.close();

        while(i >= 1)
        {
            if (( i % 2)== 0 )  even++;  else  odd++;
            i = i /10;
        }
        System.out.print("Even: "+even+" Odd: "+odd);
    }
}
