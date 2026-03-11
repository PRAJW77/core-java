
class Jamoon {
    String[] flavors;
    JItem[] items;

    Jamoon(String[] flavors, JItem[] items) {
        this.flavors = flavors;
        this.items = items;
    }

    void printInfo() {
        System.out.println("\n=====Jamoon details=======");
        if (this.flavors != null) {
            System.out.println("Flavors length: " + this.flavors.length);
            for (String flavor : this.flavors){
				System.out.println("Flavor: " + flavor);
			}
        }
        if (this.items != null) {
            System.out.println("Items length: " + this.items.length);
            for (JItem item : this.items){
				item.getInfo();
		}
        }
    }
}