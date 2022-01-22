package com.dmytroqa.remotecontrol;

public class User {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.connectDevice(new TV());

        remoteControl.turnOn();
        remoteControl.switchChannel(100);
        remoteControl.castTheScreen();
        remoteControl.turnOff();

    }
}
