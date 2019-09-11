package com.hepingfly.singleton.type8;

/**
 * 单例模式之枚举
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
    }
}

enum Singleton {
    INSTANCE;
}
