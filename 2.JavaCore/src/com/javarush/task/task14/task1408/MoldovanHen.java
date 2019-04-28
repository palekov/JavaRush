package com.javarush.task.task14.task1408;

/**
 * Created by Sashkus on 15.01.2018.
 */
public class MoldovanHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 300;
    }

    String getDescription() {

        return super.getDescription()+" Моя страна - Moldova. Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}

