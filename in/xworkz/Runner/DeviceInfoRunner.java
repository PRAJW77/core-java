package com.xworkz.in.xworkz.Runner;

import com.xworkz.in.xworkz.Device.Device;
import com.xworkz.in.xworkz.Device.DeviceInfo;

public class DeviceInfoRunner {

        public static void main(String[] args) {

            Device device = new DeviceInfo();

            System.out.println(Device.device_name);
            System.out.println(Device.battery);
            System.out.println(Device.connected);

            device.start();
            device.shutdown();

            device.sync();
            device.disconnect();

            Device.details();
        }
}
