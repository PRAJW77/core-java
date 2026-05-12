package com.xworkz.task.inner.impl;

import com.xworkz.task.inner.Seller;

public class Laptop implements Seller {

    @Override
    public String[] getLaptopNames(String brand, int quantity) {

        System.out.println("running getLaptopNames in Laptop");
        System.out.println("brand :" + brand + " quantity :" + quantity);

        return new String[]{"HP", "Dell", "Lenovo", "Asus"};
    }
}
