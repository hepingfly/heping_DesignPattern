package com.hepingfly.decorator;

/**
 * 具体的 Decorator
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力调味品");
        setPrice(2.0f);
    }
}
