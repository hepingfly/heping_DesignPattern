package com.hepingfly.bridge;

/**
 * Created by shenheping on 2019/10/9.
 */
public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("折叠式手机");
    }
    public void close() {
        super.close();
        System.out.println("折叠式手机");
    }
    public void call() {
        super.call();
        System.out.println("折叠式手机");
    }
}
