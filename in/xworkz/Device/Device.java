package com.xworkz.in.xworkz.Device;

public interface Device {
    String device_name = "SmartWatch";
    int battery = 85;
    boolean connected = true;

    void start();

    void shutdown();

    default void sync() {
        System.out.println("Device Connected");
    }

    default void disconnect() {
        System.out.println("Device disconnected");
    }

    static void details() {
        System.out.println("SmartWatch is an electronic device");
    }
}
