package com.javarush.task.task14.task1417;

/**
 * Created by Sashkus on 22.01.2018.
 */
public class Hrivna extends Money {
    public Hrivna(double amount) {
        super(amount);
    }

    public double getAmount() {
        return 0;
    }

    public String getCurrencyName() {
        return "HRN";
    }
}
