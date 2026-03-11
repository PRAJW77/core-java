class JItem{
    String flavor;
    int quantity;

    JItem(String flavor, int quantity) {
        this.flavor = flavor;
        this.quantity = quantity;
    }

    void getInfo() {
        System.out.println("Jamoon flavor: " + flavor + ", quantity: " + quantity);
    }
}
