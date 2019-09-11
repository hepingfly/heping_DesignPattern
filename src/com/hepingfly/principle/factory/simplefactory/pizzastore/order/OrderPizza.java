package com.hepingfly.principle.factory.simplefactory.pizzastore.order;

import com.hepingfly.principle.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 订购披萨
 */
public class OrderPizza {

    /**
     * 分析代码我们可以知道，如果我们多一个披萨的子类，
     * 那么这里的代码就要进行改动，这就违反了 ocp 原则，对扩展开放，对修改关闭
     *
     * 改进思路：
     * 把创建 Pizza 对象封装到一个类中，这样我们有新的 Pizza 种类时，只需要修改
     * 该类即可，其他有创建 Pizza 对象的代码就不用修改了---> 这就是简单工厂模式
     */
/*    public OrderPizza() {
        Pizza pizza = null;
        String orderType = null;  // 订购披萨的类型
        orderType = getType();
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
        // 输出披萨制作过程
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }*/

    private SimpleFactory simpleFactory;

    public OrderPizza(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    /**
     * 简单工厂方式订购披萨
     */
    public void Order() {
        String type = getType();
        // 在这里你不需要关心创建过程，传进去一个类型，就把对象给你创建好
        Pizza pizza = simpleFactory.createPizza(type);
        if (pizza != null) {
            //订购成功
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println("订购失败");
        }

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
