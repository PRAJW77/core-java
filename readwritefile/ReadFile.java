package com.xworkz.com.xworkz.readwritefile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));


            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);  // print each line
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }
    }
}
