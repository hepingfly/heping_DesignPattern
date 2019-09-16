package com.hepingfly.principle.factory.absfactory.pizzastore.order;

import com.hepingfly.principle.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.hepingfly.principle.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.hepingfly.principle.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * Created by shenheping on 2019/9/16.
 */
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
