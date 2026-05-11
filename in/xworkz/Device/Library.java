package com.xworkz.in.xworkz.Device;

public interface Library {
    String libraryName = "City Library";
    int totalBooks = 5000;
    boolean membershipAvailable = true;

    void issueBook();

    void returnBook();

    default void readRules() {
        System.out.println("Library rules displayed");
    }

    default void checkAvailability() {
        System.out.println("Book availability checked");
    }

    static void details() {
        System.out.println("Library is used for reading and borrowing books");
    }
}
