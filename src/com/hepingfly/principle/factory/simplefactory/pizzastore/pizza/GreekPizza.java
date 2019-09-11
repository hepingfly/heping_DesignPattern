package com.hepingfly.principle.factory.simplefactory.pizzastore.pizza;

/**
 * Created by shenheping on 2019/9/11.
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
