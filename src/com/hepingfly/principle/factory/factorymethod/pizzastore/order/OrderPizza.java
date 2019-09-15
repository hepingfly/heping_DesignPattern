package com.hepingfly.principle.factory.factorymethod.pizzastore.order;

import com.hepingfly.principle.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by shenheping on 2019/9/15.
 */
public abstract class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String type = getType();
        pizza = createPizza(type);
        // 输出 pizza 的制作过程
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    // 定义一个抽象方法，让各个工厂子类自己实现
    protected abstract Pizza createPizza(String orderType);

    private String getType() {
        try {
            System.out.println("请输入类型：");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
