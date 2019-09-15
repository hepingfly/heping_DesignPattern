package com.hepingfly.principle.factory.factorymethod.pizzastore.pizza;

/**
 * Created by shenheping on 2019/9/15.
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("伦敦奶酪披萨");
        System.out.println("伦敦奶酪披萨准备原材料");
    }
}
