package com.hepingfly.prototype.deepclone;

/**
 * Created by shenheping on 2019/9/18.
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType d = new DeepProtoType();
        d.setTarget(new DeepCloneableTarget("aa","bb"));
//        DeepProtoType clone = (DeepProtoType) d.clone();
        DeepProtoType clone  = (DeepProtoType) d.deepClone();
        System.out.println(d);
        System.out.println(clone);
    }
}
