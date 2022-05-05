package com.dmytroqa.solid.dip;

public abstract class ManufacturingProcess {

    // template method
    public Device buildDevice(String manufacturer, String model) {
        Device device = assemblyDevice(manufacturer, model);
        testDevice(device);
        packageDevice(device);
        storeDevice(device);

        return device;
    }

    protected abstract Device assemblyDevice(String manufacturer, String model);
    protected abstract void testDevice(Device device);
    protected abstract void packageDevice(Device device);
    protected abstract void storeDevice(Device device);
}
