package com.xworkz.task.usage;

import com.xworkz.task.inner.Seller;

public class Buyer {
    private Seller seller;

    public Buyer() {
        System.out.println("running no-arg const of Buyer");
    }

    public Buyer(Seller seller) {
        this.seller = seller;
        System.out.println("Seller parameter const of Buyer");
    }

    public void purchase() {
        if (this.seller != null) {
            String[] laptops = this.seller.getLaptopNames("Gaming", 4);
            System.out.println("available laptops");

            if (laptops != null) {

                for (String laptop : laptops) {

                    System.out.println("Laptop :" + laptop);
                }
            }
        }
    }
}