class Instrument {

    String name;
    String type;
    int price;

    Instrument() {
        System.out.println("Instrument no-arg const...");
    }

    void play() {
        System.out.println("executing play in Instrument");
    }

    void tune() {
        System.out.println("executing tune in Instrument");
    }
}