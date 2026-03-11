class CarrotHalwaItem {
    String name;
    double price;

    CarrotHalwaItem(String name,double price) {
        this.name = name;
        this.price = price;
    }

    void getInfo() {
        System.out.println("Carrot Halwa name: " + name + ", price: " + price);
    }
}
