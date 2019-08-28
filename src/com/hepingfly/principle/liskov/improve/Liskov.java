package com.hepingfly.principle.liskov.improve;

/**
 * 里氏替换原则
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("3-2=" + a.func1(3,2));
        B b = new B(a);
        // 因为 B 不再继承 A ，因此调用者就不会误以为这是调用 A 中的方法了
        System.out.println("1+2=" + b.func1(1,2));

        // 如果想调用 A 中的方法
        System.out.println("4-2=" +b.func3(4,2));

    }
}

// 创建一个更加基础的基类
class Base {
    // 把更加基础的方法和成员写到 Base 类
}

class A extends Base {
    // 返回两个数的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

// B 继承
class B extends Base {
    // 在这里可能无意间重写了 A 类的方法
    public int func1(int a, int b) {
        return a + b;
    }
    public int func2(int a, int b) {
        return func1(a,b) + 9;
    }

    // 如果 B 想使用 A 中的方法
    A a;
    public B(A a) {
        this.a = a;
    }
    public int func3(int num1, int num2) {
        return a.func1(num1,num2);
    }
}