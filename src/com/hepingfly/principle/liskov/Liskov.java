package com.hepingfly.principle.liskov;

/**
 * 里氏替换原则
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("3-2=" + a.func1(3,2));
        B b = new B();
        // 其实这里我想要调用 A 类中的方法，但是我 B 类重写了，所以这里调用的是 B 类方法
        System.out.println("4-2=" + b.func1(4,2));

    }
}

class A {
    // 返回两个数的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

// B 继承
class B extends A {
    // 在这里可能无意间重写了 A 类的方法
    public int func1(int a, int b) {
        return a + b;
    }
    public int func2(int a, int b) {
        return func1(a,b) + 9;
    }
}