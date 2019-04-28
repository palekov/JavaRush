package com.javarush.task.task14.task1408;

/**
 * Created by Sashkus on 15.01.2018.
 */
public class BelarusianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 200;
    }


    String getDescription() {

        return super.getDescription()+" Моя страна - Belarus. Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}



