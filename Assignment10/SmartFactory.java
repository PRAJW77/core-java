class SmartFactory extends Factory {

    String technology;
    int machines;
    boolean automation;
    String owner;
    int productionRate;

    SmartFactory() {
        super();
        System.out.println("no-arg const of SmartFactory");
    }

    void monitor() {
        System.out.println("executing monitor in SmartFactory");
    }
}