package com.xworkz.task.usage;

import com.xworkz.task.inner.Producers;

public class SuperMarket {
    private Producers producers;

    public SuperMarket() {
        System.out.println("running no-arg const of SuperMarket");
    }

    public SuperMarket(Producers producers) {
        this.producers = producers;
        System.out.println("Producers parameter const of SuperMarket");
    }

    public void services() {

        if (this.producers != null) {

            this.producers.purchase();
            this.producers.discount();
        }
    }
}
