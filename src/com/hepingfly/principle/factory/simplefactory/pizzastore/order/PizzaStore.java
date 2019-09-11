package com.hepingfly.principle.factory.simplefactory.pizzastore.order;

/**
 * 披萨店订购披萨，相当于一个客户端
 */
public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza();
        // 使用简单工厂模式订购披萨
        SimpleFactory factory = new SimpleFactory();
        OrderPizza orderPizza = new OrderPizza(factory);
        orderPizza.Order();
    }
}
