package com.hepingfly.principle.factory.absfactory.pizzastore.pizza;

/**
 * Created by shenheping on 2019/9/15.
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("北京胡椒披萨");
        System.out.println("北京胡椒披萨准备原材料");
    }
}
