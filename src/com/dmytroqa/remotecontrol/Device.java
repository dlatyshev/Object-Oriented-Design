package com.dmytroqa.remotecontrol;

public abstract class Device {
    protected State state;
    public abstract void turnOn();
    public abstract void turnOff();
}
