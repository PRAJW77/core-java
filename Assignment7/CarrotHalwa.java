class CarrotHalwa {
    String[] orders;
    CarrotHalwaItem[] halwas;

    CarrotHalwa(String[] orders, CarrotHalwaItem[] halwas) {
        this.orders = orders;
        this.halwas = halwas;
    }

    void printInfo() {
        System.out.println("\n=====Carrot Halwa details=======");
        if (this.orders != null) {
            System.out.println("Orders length: " + this.orders.length);
            for (String order : this.orders) {
				System.out.println("Order: " + order);
			}
        }
        if (this.halwas != null) {
            System.out.println("Halwas length: " + this.halwas.length);
            for (CarrotHalwaItem halwa : this.halwas){
				halwa.getInfo();
			}
        }
    }
}