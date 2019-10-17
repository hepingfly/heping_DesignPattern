package com.hepingfly.composite;

/**
 * Created by shenheping on 2019/10/17.
 */
public abstract class OrganizationComponent {

    private String name;  // 名字
    private String desc;  // 说明

    protected void add(OrganizationComponent organizationComponent) {
        // 默认实现
        throw new UnsupportedOperationException();
    }

    protected void remove (OrganizationComponent organizationComponent) {
        // 默认实现
        throw new UnsupportedOperationException();
    }

    // 方法 print 做成抽象的，子类都需要实现
    protected abstract void print();

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
