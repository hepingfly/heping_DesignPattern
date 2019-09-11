package com.hepingfly.singleton.type1;

/**
 * 单例模式之饿汉式，静态变量
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class Singleton {
    // 1、私有化构造器
    private Singleton() {

    }

    // 2.在对象内部创建对象实例
    private static final Singleton INSTANTCE = new Singleton();

    // 3.提供一个公有的方法，返回对象实例
    public static Singleton getInstance() {
        return INSTANTCE;
    }
}
