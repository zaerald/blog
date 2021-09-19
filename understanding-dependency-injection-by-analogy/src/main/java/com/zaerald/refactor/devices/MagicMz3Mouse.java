package com.zaerald.refactor.devices;


import com.zaerald.refactor.DeviceManufacturer;
import com.zaerald.refactor.USB;

public final class MagicMz3Mouse implements USB {

    private MagicMz3Mouse() {}

    public static MagicMz3Mouse newInstance() {
        return new MagicMz3Mouse();
    }

    @Override
    public String getDeviceName() {
        return "Magic MZ 3 Mouse - Ergonomic";
    }

    @Override
    public DeviceManufacturer getDeviceManufacturerName() {
        return DeviceManufacturer.of(
            "ZT3ch Manufacturer",
            "Your number one tech manufacturer!"
        );
    }

}
