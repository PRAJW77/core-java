class InstrumentRunner {

    public static void main(String[] args) {

        ElectronicInstrument instrument = new ElectronicInstrument();
        System.out.println("Printing Instrument Information ");

        instrument.name = "Keyboard";
        System.out.println("Name: " + instrument.name);

        instrument.type = "Electronic";
        System.out.println("Type: " + instrument.type);

        instrument.price = 15000;
        System.out.println("Price: " + instrument.price);

        instrument.brand = "Yamaha";
        System.out.println("Brand: " + instrument.brand);

        instrument.keys = 61;
        System.out.println("Keys: " + instrument.keys);

        instrument.battery = true;
        System.out.println("Battery: " + instrument.battery);

        instrument.model = "PSR-E373";
        System.out.println("Model: " + instrument.model);

        instrument.warranty = 2;
        System.out.println("Warranty: " + instrument.warranty);
        instrument.play();
        instrument.tune();
        instrument.record();

        System.out.println("\n====================");


		
		
		
        ElectronicInstrument instrument1 = new ElectronicInstrument();
        System.out.println("Printing Instrument1 Information");

        instrument1.name = "Guitar";
        System.out.println("Name: " + instrument1.name);

        instrument1.type = "Electric";
        System.out.println("Type: " + instrument1.type);

        instrument1.price = 10000;
        System.out.println("Price: " + instrument1.price);

        instrument1.brand = "Fender";
        System.out.println("Brand: " + instrument1.brand);

        instrument1.keys = 6;
        System.out.println("Keys: " + instrument1.keys);

        instrument1.battery = false;
        System.out.println("Battery: " + instrument1.battery);

        instrument1.model = "Stratocaster";
        System.out.println("Model: " + instrument1.model);

        instrument1.warranty = 1;
        System.out.println("Warranty: " + instrument1.warranty);
        instrument1.play();
        instrument1.tune();
        instrument1.record();

        System.out.println("\n====================");

		
		
		

        Instrument instrument2 = new ElectronicInstrument();
        instrument2.name = "Piano";
        System.out.println("Name: " + instrument2.name);

        instrument2.type = "Acoustic";
        System.out.println("Type: " + instrument2.type);

        instrument2.price = 50000;
        System.out.println("Price: " + instrument2.price);
        instrument2.play();
        instrument2.tune();

        System.out.println("\n====================");

		
		

        Instrument instrument3 = new ElectronicInstrument();
        instrument3.name = "Drums";
        System.out.println("Name: " + instrument3.name);

        instrument3.type = "Percussion";
        System.out.println("Type: " + instrument3.type);

        instrument3.price = 20000;
        System.out.println("Price: " + instrument3.price);
        instrument3.play();
        instrument3.tune();
    }
}