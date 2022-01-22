package com.dmytroqa.remotecontrol;

public class TV extends Device {

    private int channelNumber;

    @Override
    public void turnOn() {
        this.state = State.ON;
        System.out.println("TV is on.");
    }

    @Override
    public void turnOff() {
        this.state = State.OFF;
        System.out.println("TV is off.");
    }

    public void switchChannel(int channelNumber) {
        if (channelNumber < 0 || channelNumber > 100) {
            throw new IllegalArgumentException("Channel should be between 1 and 100");
        }
        if (this.state == State.OFF) return;

        this.channelNumber = channelNumber;
        System.out.println("Channel was changed to " + channelNumber);
    }
}
