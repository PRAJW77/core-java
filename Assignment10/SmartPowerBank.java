class SmartPowerBank extends PowerBank {
    int fastChargeWatts;
    int ports;
    boolean wirelessCharging;
    String model;
    int price;

 SmartPowerBank() {
        super();
        System.out.println("no-arg const of SmartPowerBank");
    }
    void smartFeatures() {
        System.out.println("executing Smart features");
    }
}