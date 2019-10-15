package com.hepingfly.decorator;

/**
 * Created by shenheping on 2019/10/14.
 */
public class Decorator extends Drink {

    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        // getPrice 是自己的价格
        return getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        return super.getDes() + " " + super.getPrice() + " " + obj.getDes();
    }
}
