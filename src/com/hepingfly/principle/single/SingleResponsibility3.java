package com.hepingfly.principle.single;

/**
 * Created by shenheping on 2019/8/25.
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("摩托车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("船");
    }
}

/**
 * 这种设计方式，没有对原来的类做大的修改，只是增加方法
 * 虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上，仍然是遵守单一职责原则的
 */
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑");
    }
    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天上跑");
    }
    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水里跑");
    }

}
