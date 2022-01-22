package com.dmytroqa.remotecontrol;

public class Projector extends Device {

    @Override
    public void turnOn() {
        this.state = State.ON;
    }

    @Override
    public void turnOff() {
        this.state = State.OFF;
    }

    public void screenCast() {
        System.out.println("Casting the screen.");
    }
}
