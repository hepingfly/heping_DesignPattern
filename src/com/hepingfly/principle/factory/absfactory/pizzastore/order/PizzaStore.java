package com.hepingfly.principle.factory.absfactory.pizzastore.order;

/**
 * Created by shenheping on 2019/9/16.
 */
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza();
        orderPizza.setAbsFactory(new BJFactory());
        orderPizza.order();
    }
}
