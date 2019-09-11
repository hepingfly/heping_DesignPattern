package com.hepingfly.singleton.type6;

/**
 * 单例模式之双重检查
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class Singleton {
    private static volatile Singleton instance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        /**
         * 假如说现在有两个线程都进入到 instance == null 这个条件里面
         * 进去之后由于有 synchronized，那么只会有一个线程握住锁，握住锁以后
         * 假设这时候 instance 为空，那么这个线程就会去创建实例，创建完实例后
         * 线程执行结束，这个时候另一个线程握住锁，进来之后会再判断一次 instance 是否为空
         * 显然这时候 instance 已经不为空了，则不创建实例
         * 同时，如果下次在获取实例，在第一层判断就会被拦下，直接返回 instance，
         * 避免了同步方法被多次执行
         */
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
