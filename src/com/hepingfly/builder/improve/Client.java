package com.hepingfly.builder.improve;

/**
 * Created by shenheping on 2019/9/22.
 */
public class Client {
    public static void main(String[] args) {
        // 盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        // 创建房子的指挥者
        HouseDirector director = new HouseDirector(commonHouse);
        // 完成盖房子
        House house = director.constructHouse();
    }
}
