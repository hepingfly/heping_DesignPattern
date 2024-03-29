package com.hepingfly.principle.single;

/**
 * Created by shenheping on 2019/8/25.
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");

    }
}

/**
 * 这种设计方式符合单一职责原则
 * 但是这种方式开销太大，并且修改完之后，客户端也要跟着修改（比如再扩展几个类，那么客户端也需要 new 对应的类）
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑");
    }
}
class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天上跑");
    }
}
class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在水里跑");
    }
}
