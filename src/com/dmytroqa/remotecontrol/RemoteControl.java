package com.dmytroqa.remotecontrol;


public class RemoteControl {

    private Device device;

    public void connectDevice(Device device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }

    public void switchChannel(int channelNumber) {
        if (!(device instanceof TV)) return;
        ((TV) device).switchChannel(channelNumber);
    }

    public void castTheScreen() {
        if (!(device instanceof Projector)) return;
        ((Projector) device).screenCast();
    }


}
