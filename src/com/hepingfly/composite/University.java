package com.hepingfly.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shenheping on 2019/10/17.
 */
public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponentList = new ArrayList<OrganizationComponent>();


    public University(String name, String desc) {
        super(name, desc);
    }

    // 重写 add 方法
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponentList.add(organizationComponent);
    }

    // 重写 remove 方法
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponentList.remove(organizationComponent);
    }

    // print 方法，输入 university 包含的学院
    @Override
    protected void print() {
        System.out.println("-------" + getName());
        for(OrganizationComponent org : organizationComponentList) {
            org.print();
        }

    }
}
