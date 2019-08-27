package com.hepingfly.principle.inversion.improve;

/**
 * 依赖倒转原则
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Wechat());
    }
}

interface IReceiver {
    public String getInfo();
}

// 电子邮件
class Email implements IReceiver {
    public String getInfo() {
        return "电子邮件信息：hello,world";
    }
}

// 微信
class Wechat implements IReceiver {

    @Override
    public String getInfo() {
        return "电子邮件信息：wechat";
    }
}


class Person {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}
