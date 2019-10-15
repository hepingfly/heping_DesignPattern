package com.hepingfly.decorator;

/**
 * 具体的 Decorator
 */
public class Soy extends Decorator {

    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆调味品");
        setPrice(4.0f);
    }
}
