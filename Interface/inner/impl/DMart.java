package com.xworkz.task.inner.impl;

import com.xworkz.task.inner.Producers;

public class DMart implements Producers {
    @Override
    public void purchase() {
        System.out.println("running purchase in DMart");
    }

    @Override
    public void discount() {
        System.out.println("running discount in DMart");

    }
}
