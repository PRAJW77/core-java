package com.xworkz.task.Runner;

import com.xworkz.task.inner.OS;
import com.xworkz.task.inner.impl.Windows;
import com.xworkz.task.usage.Dell;

public class DellRunner {
    public static void main(String[] args) {

        OS os = new Windows();

        Dell dell = new Dell(os); // OS --> abstraction

        dell.operate();
    }
}
