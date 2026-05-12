package com.xworkz.task.Runner;

import com.xworkz.task.inner.Producers;
import com.xworkz.task.inner.impl.DMart;
import com.xworkz.task.usage.SuperMarket;

public class SuperMarketRunner {
    public static void main(String[] args) {

        Producers producers = new DMart();

        SuperMarket superMarket = new SuperMarket(producers);

        superMarket.services();
    }
}
