package com.hepingfly.adapter.classadapter;

/**
 * 适配器类
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int src = output220V();
        // 将其转换成 5v 电压
        int dec = src/ 44;
        return dec;
    }
}
