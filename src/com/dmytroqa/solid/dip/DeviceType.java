package com.dmytroqa.solid.dip;

public enum DeviceType {

    SMARTPHONE(new SmartphonesManufacturingProcess()),
    TABLET(new TabletManufacturingProcess());

    DeviceType(ManufacturingProcess process) {
        this.process = process;
    }

    private ManufacturingProcess process;

    public ManufacturingProcess process() {
        return process;
    }
}
