class PowerBank {
    String brand;
    int capacity;
    String color;
	
    PowerBank() {
        System.out.println("PowerBank no-arg const...");
    }
    void charge() {
        System.out.println("executing charge in PowerBank");
    }
    void displayInfo() {
        System.out.println("executing displayInfo in PowerBank");
    }
}