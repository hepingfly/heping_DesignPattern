package com.hepingfly.principle.factory.factorymethod.pizzastore.pizza;

/**
 * Created by shenheping on 2019/9/15.
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("伦敦胡椒披萨");
        System.out.println("伦敦胡椒披萨准备原材料");
    }
}
