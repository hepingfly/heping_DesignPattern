package com.hepingfly.principle.factory.simplefactory.pizzastore.pizza;

/**
 * Created by shenheping on 2019/9/11.
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给准备奶酪披萨准备原材料");
    }
}
