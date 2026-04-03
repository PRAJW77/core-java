class ClockRunner {

    public static void main(String[] args) {

        DigitalClock clock = new DigitalClock();
        System.out.println("Printing Clock Information using Inheritance");

        clock.color = "Black";
        System.out.println("Color: " + clock.color);

        clock.price = 450;
        System.out.println("Price: " + clock.price);

        clock.working = true;
        System.out.println("Working: " + clock.working);

        clock.originCountry = "India";
        System.out.println("Origin Country: " + clock.originCountry);

        clock.yearFounded = 1971;
        System.out.println("Year Founded: " + clock.yearFounded);

        clock.founder = "Founder A";
        System.out.println("Founder: " + clock.founder);

        clock.website = "example.com";
        System.out.println("Website: " + clock.website);

        clock.tradeName = "Digital Clock Pvt Ltd";
        System.out.println("Trade Name: " + clock.tradeName);
        clock.getBrands();
        clock.saveTimings();
        clock.getProducts();

        System.out.println("\n====================");


		
		
        DigitalClock clock1 = new DigitalClock();
        System.out.println("Printing Clock1 Information");

        clock1.color = "White";
        System.out.println("Color: " + clock1.color);

        clock1.price = 500;
        System.out.println("Price: " + clock1.price);

        clock1.working = true;
        System.out.println("Working: " + clock1.working);

        clock1.originCountry = "India";
        System.out.println("Origin Country: " + clock1.originCountry);

        clock1.yearFounded = 2000;
        System.out.println("Year Founded: " + clock1.yearFounded);

        clock1.founder = "Founder B";
        System.out.println("Founder: " + clock1.founder);

        clock1.website = "digital.com";
        System.out.println("Website: " + clock1.website);

        clock1.tradeName = "Smart Clock Ltd";
        System.out.println("Trade Name: " + clock1.tradeName);
        clock1.getBrands();
        clock1.saveTimings();
        clock1.getProducts();

        System.out.println("\n====================");

		
		

        Clock clock2 = new DigitalClock();
        clock2.color = "Blue";
        System.out.println("Color: " + clock2.color);

        clock2.price = 400;
        System.out.println("Price: " + clock2.price);

        clock2.working = false;
        System.out.println("Working: " + clock2.working);
        clock2.getBrands();
        clock2.saveTimings();

        System.out.println("\n====================");


		
        Clock clock3 = new DigitalClock();
        clock3.color = "Red";
        System.out.println("Color: " + clock3.color);

        clock3.price = 350;
        System.out.println("Price: " + clock3.price);

        clock3.working = true;
        System.out.println("Working: " + clock3.working);
        clock3.getBrands();
        clock3.saveTimings();
    }
}