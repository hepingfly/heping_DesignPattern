package com.hepingfly.composite;

/**
 * Created by shenheping on 2019/10/17.
 */
public class Department extends OrganizationComponent {
    public Department(String name, String desc) {
        super(name, desc);
    }


    // add 方法和 remove 方法就不用写了，因为它是叶子节点

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
