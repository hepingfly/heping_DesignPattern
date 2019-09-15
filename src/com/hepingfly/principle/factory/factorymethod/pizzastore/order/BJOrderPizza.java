package com.hepingfly.principle.factory.factorymethod.pizzastore.order;

import com.hepingfly.principle.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.hepingfly.principle.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.hepingfly.principle.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * Created by shenheping on 2019/9/15.
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    protected Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
