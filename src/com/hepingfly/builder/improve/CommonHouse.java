package com.hepingfly.builder.improve;

/**
 * Created by shenheping on 2019/9/22.
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子盖屋顶");
    }
}
