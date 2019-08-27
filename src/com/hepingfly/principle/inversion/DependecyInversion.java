package com.hepingfly.principle.inversion;

/**
 * 依赖倒转原则
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息：hello,world";
    }
}

/**
 * 完成 Person 接收消息的功能
 * 方式一（下面这种方式）分析：
 * 1. 简单，比较容易想到
 * 2. 如果我们获取的对象是微信，短信等，则需要新增类，同时 Person 也需要增加相应的接收方法
 * 3.解决方式：
 *      引入一个抽象的接口 IReceiver ，表示接收者，这样 Person 类与接口 IReceiver 发生依赖
 *      因为 Email wechat 等属于接收的参数，让他们各自实现 IReceiver 接口就行
 */
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
