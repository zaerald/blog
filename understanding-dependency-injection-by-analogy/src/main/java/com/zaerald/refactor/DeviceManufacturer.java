package com.zaerald.refactor;

public final class DeviceManufacturer {

    private final String name;

    private final String description;

    private DeviceManufacturer( String name, String description ) {
        this.name = name;
        this.description = description;
    }

    public static DeviceManufacturer of( String name, String description ) {
        return new DeviceManufacturer( name, description );
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "DeviceManufacturer{" +
            "name='" + name + '\'' +
            ", description='" + description + '\'' +
            '}';
    }
}
