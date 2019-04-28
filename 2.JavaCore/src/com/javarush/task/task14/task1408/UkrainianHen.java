package com.javarush.task.task14.task1408;

/**
 * Created by Sashkus on 15.01.2018.
 */
public class UkrainianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 255;
    }

    String getDescription() {

        return super.getDescription()+" Моя страна - Ukraine. Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}


