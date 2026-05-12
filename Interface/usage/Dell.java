package com.xworkz.task.usage;

import com.xworkz.task.inner.OS;

public class Dell {
    private OS os;

    public Dell() {
        System.out.println("running no-arg const of Dell");
    }

    public Dell(OS os) {
        this.os = os;
        System.out.println("OS parameter const of Dell");
    }

    public void operate() {

        if (this.os != null) {

            this.os.boot();
            this.os.start();
            this.os.stop();
        }
    }
}
