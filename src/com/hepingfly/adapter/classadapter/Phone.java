package com.hepingfly.adapter.classadapter;

/**
 *
 */
public class Phone {

    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为 5v，可以充电");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压大于 5v，不能充电");
        }

    }


}
