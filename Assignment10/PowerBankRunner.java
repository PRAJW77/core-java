class PowerBankRunner {

    public static void main(String... values) {

        SmartPowerBank powerBank = new SmartPowerBank();
        System.out.println("Printing PowerBank Information ");

        powerBank.brand = "Mi";
        System.out.println("Brand: " + powerBank.brand);

        powerBank.capacity = 20000;
        System.out.println("Capacity: " + powerBank.capacity);

        powerBank.color = "Black";
        System.out.println("Color: " + powerBank.color);

        powerBank.model = "Pro X";
        System.out.println("Model: " + powerBank.model);

        powerBank.fastChargeWatts = 33;
        System.out.println("Fast Charge Watts: " + powerBank.fastChargeWatts);

        powerBank.ports = 3;
        System.out.println("Ports: " + powerBank.ports);

        powerBank.wirelessCharging = true;
        System.out.println("Wireless Charging: " + powerBank.wirelessCharging);

        powerBank.price = 1999;
        System.out.println("Price: " + powerBank.price);
		
        powerBank.charge();
        powerBank.displayInfo();
        powerBank.smartFeatures();
		
		System.out.println("\n====================");


        SmartPowerBank powerBank1 = new SmartPowerBank();
        System.out.println("Printing PowerBank1 Information");

        powerBank1.brand = "Realme";
        System.out.println("Brand: " + powerBank1.brand);

        powerBank1.capacity = 15000;
        System.out.println("Capacity: " + powerBank1.capacity);

        powerBank1.color = "Blue";
        System.out.println("Color: " + powerBank1.color);

        powerBank1.model = "C Series";
        System.out.println("Model: " + powerBank1.model);

        powerBank1.fastChargeWatts = 18;
        System.out.println("Fast Charge Watts: " + powerBank1.fastChargeWatts);

        powerBank1.ports = 2;
        System.out.println("Ports: " + powerBank1.ports);

        powerBank1.wirelessCharging = false;
        System.out.println("Wireless Charging: " + powerBank1.wirelessCharging);

        powerBank1.price = 1499;
        System.out.println("Price: " + powerBank1.price);
		
        powerBank1.charge();
        powerBank1.displayInfo();
        powerBank1.smartFeatures();

        System.out.println("\n====================");
		
		

        PowerBank powerBank2 = new SmartPowerBank();
        powerBank2.brand = "Samsung";
        System.out.println("Brand: " + powerBank2.brand);

        powerBank2.capacity = 10000;
        System.out.println("Capacity: " + powerBank2.capacity);

        powerBank2.color = "White";
        System.out.println("Color: " + powerBank2.color);
        powerBank2.charge();
        powerBank2.displayInfo();

        System.out.println("\n====================");
		
		

        PowerBank powerBank3 = new SmartPowerBank();
        powerBank3.brand = "OnePlus";
        System.out.println("Brand: " + powerBank3.brand);

        powerBank3.capacity = 25000;
        System.out.println("Capacity: " + powerBank3.capacity);

        powerBank3.color = "Red";
        System.out.println("Color: " + powerBank3.color);
        powerBank3.charge();
        powerBank3.displayInfo();

     
    }
}