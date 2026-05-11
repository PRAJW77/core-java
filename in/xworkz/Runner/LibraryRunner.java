package com.xworkz.in.xworkz.Runner;

import com.xworkz.in.xworkz.Device.Library;
import com.xworkz.in.xworkz.Device.LibraryInfo;

public class LibraryRunner {
    public static void main(String[] args) {

        Library library = new LibraryInfo();

        System.out.println(Library.libraryName);
        System.out.println(Library.totalBooks);
        System.out.println(Library.membershipAvailable);

        library.issueBook();
        library.returnBook();

        library.readRules();
        library.checkAvailability();

        Library.details();
    }
}
