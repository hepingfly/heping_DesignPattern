package com.hepingfly.bridge;

/**
 * Created by shenheping on 2019/10/9.
 */
public class Client {
    public static void main(String[] args) {
        FoldedPhone foldedPhone = new FoldedPhone(new Vivo());
        foldedPhone.open();
        foldedPhone.close();
        foldedPhone.call();

        UpRightPhone upRightPhone = new UpRightPhone(new XiaoMi());
        upRightPhone.open();
        upRightPhone.close();
        upRightPhone.call();

    }
}
