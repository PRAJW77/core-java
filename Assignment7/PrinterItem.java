class PrinterItem {
    String model;
    double price;

    PrinterItem(String model, double price) {
        this.model = model;
        this.price = price;
    }

    void getInfo() {
        System.out.println("Printer model: " + model + ", price: " + price);
    }
}