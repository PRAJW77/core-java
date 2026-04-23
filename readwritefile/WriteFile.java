package com.xworkz.com.xworkz.readwritefile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {

            try {
                FileWriter writer = new FileWriter("output.txt");
                writer.write("Hello, this is a sample string.");
                writer.close();
                System.out.println("Successfully written to file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
}


