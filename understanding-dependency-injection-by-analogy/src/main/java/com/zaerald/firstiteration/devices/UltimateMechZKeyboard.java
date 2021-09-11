package com.zaerald.firstiteration.devices;

import com.zaerald.firstiteration.USB;

public class UltimateMechZKeyboard implements USB {

    @Override
    public String getDeviceName() {
        return "Ultimate MechZ Keyboard";
    }

    @Override
    public String getDeviceManufacturerName() {
        return "Z3R0 Manufacturer";
    }

}
