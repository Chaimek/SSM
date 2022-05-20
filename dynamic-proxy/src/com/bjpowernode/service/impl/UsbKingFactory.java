package com.bjpowernode.service.impl;

import com.bjpowernode.service.UsbSell;

public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int count) {
        return 85.0f;
    }
}
