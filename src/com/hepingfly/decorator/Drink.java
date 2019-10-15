package com.hepingfly.decorator;

/**
 * Created by shenheping on 2019/10/14.
 */
public abstract class Drink {
    private String des;  // 描述
    private float price = 0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // 计算费用的抽象方法，该方法会被子类实现
    public abstract float cost();
}
