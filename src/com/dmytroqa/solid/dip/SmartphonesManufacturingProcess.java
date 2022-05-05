package com.dmytroqa.solid.dip;

class SmartphonesManufacturingProcess extends ManufacturingProcess {

    @Override
    public Device assemblyDevice(String manufacturer, String model) {
        System.out.printf("Assembling smartphone of manufacturer '%s', model: '%s'\n", manufacturer, model);
        return new Smartphone(manufacturer, model);
    }

    @Override
    public void testDevice(Device device) {
        System.out.println("Testing smartphone: " + device);
    }

    @Override
    public void packageDevice(Device device) {
        System.out.println("Packaging smartphone: " + device);
    }

    @Override
    public void storeDevice(Device device) {
        System.out.println("Storing smartphone: " + device);
    }
}
