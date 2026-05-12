package com.xworkz.task.Runner;

import com.xworkz.task.inner.impl.Laptop;
import com.xworkz.task.inner.Seller;
import com.xworkz.task.usage.Buyer;

public class BuyerRunner {
    public static void main(String[] args) {

        Seller seller = new Laptop();

        Buyer buyer = new Buyer(seller); // seller --> abstraction

        buyer.purchase();
    }
}
