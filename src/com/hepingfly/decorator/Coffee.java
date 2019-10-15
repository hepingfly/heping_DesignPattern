package com.hepingfly.decorator;

/**
 * Created by shenheping on 2019/10/14.
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
