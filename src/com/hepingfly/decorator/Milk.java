package com.hepingfly.decorator;

/**
 * 具体的 Decorator
 */
public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶调味品");
        setPrice(3.0f);
    }
}
