package com.javarush.task.task14.task1408;

/**
 * Created by Sashkus on 15.01.2018.
 */
public class RussianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 100;
    }

    String getDescription() {

       return super.getDescription()+" Моя страна - Russia. Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
