package com.hepingfly.principle.factory.simplefactory.pizzastore.order;

import com.hepingfly.principle.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.hepingfly.principle.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.hepingfly.principle.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.hepingfly.principle.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * 简单工厂类
 */
public class SimpleFactory {

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("geek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
