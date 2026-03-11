class Paint{
    String color;
    double quantity;

    Paint(String color, double quantity) {
        this.color = color;
        this.quantity = quantity;
    }

    void getInfo() {
        System.out.println("Paint color: " + color + ", quantity: " + quantity + "L");
    }
}