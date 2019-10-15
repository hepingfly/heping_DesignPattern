package com.hepingfly.decorator;

/**
 * Created by shenheping on 2019/10/15.
 */
public class CoffeeBar {
    public static void main(String[] args) {
        // 装饰者模式下订单：2份巧克力 + 1份牛奶的 LongBlack

        Drink order = new LongBlack();

        // order 加入一份牛奶
        order = new Milk(order);
        System.out.println(order.cost());
        System.out.println(order.getDes());

        // order 加入一份巧克力
        order = new Chocolate(order);
        System.out.println(order.cost());
        System.out.println(order.getDes());

        // order 加入一份巧克力
        order = new Chocolate(order);
        System.out.println(order.cost());
        System.out.println(order.getDes());

        /**
         * jkd 的 io 体系中，使用的就是装饰者模式
         * 1、InputStream 是抽象类，类似我们这里的 Drink
         * 2、FileInputStream 是 InputStream 的子类，类似我们这里的 LongBlack ShortBlack
         * 3、FilterInputStream 是 InputStream 的子类，类似我们这里的 Decorator 修饰者
         * 4、DataInputStream 是 FilterInputStream 的子类，具体的修饰者，类似前面的 Milk Soy
         * 5、FilterInputStream 类有 protected volatile InputStream in;  即包含被装饰者
         */

    }
}
