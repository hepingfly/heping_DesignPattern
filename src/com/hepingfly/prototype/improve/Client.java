package com.hepingfly.prototype.improve;

/**
 * Created by shenheping on 2019/9/17.
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("tom",1,"白色");
        Sheep sheep1 = (Sheep) sheep.clone();
        System.out.println(sheep);
        System.out.println(sheep1);
    }
}
