package com.xworkz.in.xworkz.Device;

public class LibraryInfo implements Library{
    @Override
    public void issueBook() {
        System.out.println("Book issued.");
    }

    @Override
    public void returnBook() {
        System.out.println("Book returned.");
    }
}
