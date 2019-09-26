package com.hepingfly.adapter.interfaceadapter;

/**
 * Created by shenheping on 2019/9/26.
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            public void m1() {
                System.out.println("这是 m1 方法");
            }
        };
        absAdapter.m1();

    }
}
