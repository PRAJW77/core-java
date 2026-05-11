package com.xworkz.in.xworkz.Device;

public class DeviceInfo implements Device {
    @Override
    public void start() {
        System.out.println("The SmartWatch is starting.");
    }

    @Override
    public void shutdown() {
        System.out.println("The SmartWatch is shutting down.");
    }
}
