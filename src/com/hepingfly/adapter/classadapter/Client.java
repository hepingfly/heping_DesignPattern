package com.hepingfly.adapter.classadapter;

/**
 * Created by shenheping on 2019/9/26.
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
