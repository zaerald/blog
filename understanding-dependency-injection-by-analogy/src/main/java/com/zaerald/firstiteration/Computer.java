package com.zaerald.firstiteration;

public final class Computer {

    private USB usb;

    // constructor injection
    public Computer( USB usb ) {
        this.usb = usb;
    }

    // method injection
    public void injectNewDevice( USB usb ) {
        this.usb = usb;
    }

    public void readDevice() {
        System.out.println( "Starting to read the device information..." );
        System.out.println( "-----" );
        System.out.println( "Device name: " + usb.getDeviceName() );
        System.out.println( "Device Manufacturer name: " + usb.getDeviceManufacturerName() );
        System.out.println( "-----" );
        System.out.println( "Finished reading the device information.\n" );
    }

}
