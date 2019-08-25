package com.hepingfly.principle.single;

/**
 *
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

/**
 * 这里面 run 方法的设计就违反了单一职责原则
 * 因为随着我传入交通工具的不同，它的结果都是 xxxx 在公路上跑。
 * 比如，传入飞机，显示飞机在公路上跑，显然有问题
 */
class Vehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑");
    }
}
