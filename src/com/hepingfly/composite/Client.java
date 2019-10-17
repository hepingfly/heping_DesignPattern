package com.hepingfly.composite;

/**
 * Created by shenheping on 2019/10/17.
 */
public class Client {
    public static void main(String[] args) {
        // 从大到小创建对象

        // 创建学校
        OrganizationComponent university = new University("清华大学","top大学");

        // 创建学院
        OrganizationComponent college1 = new College("计算机学院","计算机学院");
        OrganizationComponent college2 = new College("信息工程学院","信息工程学院");

        // 创建系
        college1.add(new Department("软件工程","good"));
        college1.add(new Department("网络工程","well"));
        college2.add(new Department("通信工程","nice"));
        college2.add(new Department("信息工程","happy"));

        university.add(college1);
        university.add(college2);
        university.print();


    }
}
