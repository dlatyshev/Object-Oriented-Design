package com.dmytroqa.solid.dip;

class TabletManufacturingProcess extends ManufacturingProcess {

    @Override
    public Device assemblyDevice(String manufacturer, String model) {
        System.out.printf("Assembling tablet of manufacturer '%s', model: '%s'\n", manufacturer, model);
        return new Tablet(manufacturer, model);
    }

    @Override
    public void testDevice(Device device) {
        System.out.println("Testing tablet: " + device);
    }

    @Override
    public void packageDevice(Device device) {
        System.out.println("Packaging tablet: " + device);
    }

    @Override
    public void storeDevice(Device device) {
        System.out.println("Storing tablet: " + device);
    }
}
