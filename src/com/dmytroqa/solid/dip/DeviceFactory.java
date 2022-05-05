package com.dmytroqa.solid.dip;

public class DeviceFactory {

    public static Device buildDevice(DeviceType type, String manufacturer, String model) {
        return type.process().buildDevice(manufacturer, model);
    }
}
