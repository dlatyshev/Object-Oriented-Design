package com.dmytroqa.solid.dip;

public class Main {

    public static void main(String[] args) {
        Device iphone = DeviceFactory.buildDevice(DeviceType.SMARTPHONE, "Iphone", "13 Pro");
        Device iPad = DeviceFactory.buildDevice(DeviceType.TABLET, "IPad", "PRO");
    }
}
