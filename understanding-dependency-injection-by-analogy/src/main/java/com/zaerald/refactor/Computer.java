package com.zaerald.refactor;

public final class Computer {

    private USB usb;

    private Computer() {
    }

    // constructor injection
    private Computer( USB usb ) {
        this.usb = usb;
    }

    public static Computer newInstance() {
        return new Computer();
    }

    // indirect constructor injection
    public static Computer with( USB usb ) {
        return new Computer( usb );
    }

    public void readDevice() {
        System.out.println( "Starting to read the device information..." );
        System.out.println( "-----" );
        System.out.println( "Device name: " + usb.getDeviceName() );
        System.out.println( "Device Manufacturer: " + usb.getDeviceManufacturerName() );
        System.out.println( "-----" );
        System.out.println( "Finished reading the device information.\n" );
    }

}
