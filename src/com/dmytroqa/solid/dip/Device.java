package com.dmytroqa.solid.dip;

public abstract class Device {

    public Device(String manufacturer, String model) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.state = State.OFF;
        this.volume = new Volume();
    }

    private String model;
    private String manufacturer;
    private State state;
    private Volume volume;

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public State getState() {
        return state;
    }

    public Volume getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " {" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
