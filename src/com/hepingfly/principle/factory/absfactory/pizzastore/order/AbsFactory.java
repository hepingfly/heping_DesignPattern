package com.hepingfly.principle.factory.absfactory.pizzastore.order;

import com.hepingfly.principle.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * 抽象工厂模式的抽象层
 */
public interface AbsFactory {

    // 让下面的工厂子类来具体实现
    public Pizza createPizza(String orderType);
}
