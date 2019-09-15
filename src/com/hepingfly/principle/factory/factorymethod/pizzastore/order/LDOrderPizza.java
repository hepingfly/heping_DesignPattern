package com.hepingfly.principle.factory.factorymethod.pizzastore.order;

import com.hepingfly.principle.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.hepingfly.principle.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import com.hepingfly.principle.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * Created by shenheping on 2019/9/15.
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    protected Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
