package com.zaerald.firstiteration.devices;

import com.zaerald.firstiteration.USB;

public final class MagicMz3Mouse implements USB {

    @Override
    public String getDeviceName() {
        return "Magic MZ 3 Mouse - Ergonomic";
    }

    @Override
    public String getDeviceManufacturerName() {
        return "ZT3ch Manufacturer";
    }

}
