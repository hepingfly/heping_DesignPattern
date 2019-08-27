package com.hepingfly.principle.segregation.improve;

/**
 * 接口隔离原则
 */
public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());
    }
}

interface Interface1 {
    void operation1();
}

interface Interface2 {
    void operation2();
    void operation3();
}

interface Interface3 {
    void operation4();
    void operation5();
}

class B implements Interface1,Interface2 {

    @Override
    public void operation1() {
        System.out.println("operation1 方法");
    }

    @Override
    public void operation2() {
        System.out.println("operation2 方法");
    }

    @Override
    public void operation3() {
        System.out.println("operation3 方法");
    }

}

class D implements Interface1,Interface3 {

    @Override
    public void operation1() {
        System.out.println("operation1 方法");
    }
    @Override
    public void operation4() {
        System.out.println("operation4 方法");
    }

    @Override
    public void operation5() {
        System.out.println("operation5 方法");
    }

}

// A 类通过接口 Interface1、Interface2  依赖（使用）B类，但是只会用到 1,2,3 方法
class A {
    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend2(Interface2 i) {
        i.operation2();
    }
    public void depend3(Interface2 i) {
        i.operation3();
    }
}

// C 类通过接口 Interface1、Interface3 依赖（使用）D类，但是只会用到 1,4,5 方法
class C {
    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend4(Interface3 i) {
        i.operation4();
    }
    public void depend5(Interface3 i) {
        i.operation5();
    }
}
