package com.dmytroqa.remotecontrol;

public class SurroundSoundSystem extends Device {

    @Override
    public void turnOn() {
        this.state = State.ON;
        System.out.println("Surround sound system is on.");
    }

    @Override
    public void turnOff() {
        this.state = State.OFF;
        System.out.println("Surround sound system is off.");
    }

}
