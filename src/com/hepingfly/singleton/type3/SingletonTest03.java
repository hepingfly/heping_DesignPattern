package com.hepingfly.singleton.type3;

/**
 * 懒汉式-线程不安全
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
class Singleton {
    private static Singleton instance;
    private Singleton() {

    }

    // 提供一个静态的公有方法，当使用到该方法时，才去创建 instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
