package com.hepingfly.prototype;

/**
 * Created by shenheping on 2019/9/17.
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom",1,"白色");
        Sheep sheep1 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        System.out.println(sheep);
        System.out.println(sheep1);
    }
}
