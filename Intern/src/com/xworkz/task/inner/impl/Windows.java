package com.xworkz.task.inner.impl;

import com.xworkz.task.inner.OS;

public class Windows implements OS {
    @Override
    public void boot() {
        System.out.println("running boot in Windows");
    }

    @Override
    public void start() {
        System.out.println("running start in Windows");
    }

    @Override
    public void stop() {
        System.out.println("running stop in Windows");
    }
}
