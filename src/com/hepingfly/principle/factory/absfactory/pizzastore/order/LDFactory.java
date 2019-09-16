package com.hepingfly.principle.factory.absfactory.pizzastore.order;

import com.hepingfly.principle.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import com.hepingfly.principle.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import com.hepingfly.principle.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * Created by shenheping on 2019/9/16.
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
