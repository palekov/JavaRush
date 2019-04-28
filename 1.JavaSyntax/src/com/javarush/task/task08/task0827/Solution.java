package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/*
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года — нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date start = new Date();
        Date current = new Date(date);

        start.setHours(0);
        start.setMinutes(0);
        start.setSeconds(0);
        start.setDate(1);
        start.setMonth(0);
        start.setYear(current.getYear());

        long razn = current.getTime() - start.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int day = (int) (razn/msDay);
        //System.out.println(day);

        if (day%2==0){
            return false;
        }
        else {
            return true;
        }
    }
}