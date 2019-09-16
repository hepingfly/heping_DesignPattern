package com.hepingfly.principle.factory.absfactory.pizzastore.order;

import com.hepingfly.principle.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by shenheping on 2019/9/16.
 */
public class OrderPizza {

    private AbsFactory absFactory;

    public AbsFactory getAbsFactory() {
        return absFactory;
    }

    public void setAbsFactory(AbsFactory absFactory) {
        this.absFactory = absFactory;
    }

    public void order() {
        String type = getType();
        Pizza pizza = absFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

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
