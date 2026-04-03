class ElectronicInstrument extends Instrument {

    String brand;
    int keys;
    boolean battery;
    String model;
    int warranty;

    ElectronicInstrument() {
        super();
        System.out.println("no-arg const of ElectronicInstrument");
    }

    void record() {
        System.out.println("executing record in ElectronicInstrument");
    }
}