package com.hepingfly.adapter.objectadapter;

/**
 * 适配器类
 */
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (voltage220V != null) {
            // 获取 220v 电压
            int src = voltage220V.output220V();
            dst = src / 44;
        }
        return dst;
    }
}
