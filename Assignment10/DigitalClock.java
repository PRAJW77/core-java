class DigitalClock extends Clock {

    String originCountry;
    int yearFounded;
    String founder;
    String website;
    String tradeName;

    DigitalClock() {
        super();
        System.out.println("no-arg const of DigitalClock");
    }

    void getProducts() {
        System.out.println("executing getProducts in DigitalClock");
    }
}