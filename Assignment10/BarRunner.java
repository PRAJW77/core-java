class BarRunner {

    public static void main(String[] args) {

        PremiumBar bar = new PremiumBar();
        System.out.println("Printing Bar Information ");

        bar.name = "Night Club";
        System.out.println("Name: " + bar.name);

        bar.location = "Bangalore";
        System.out.println("Location: " + bar.location);

        bar.capacity = 200;
        System.out.println("Capacity: " + bar.capacity);

        bar.owner = "Owner A";
        System.out.println("Owner: " + bar.owner);

        bar.rating = 5;
        System.out.println("Rating: " + bar.rating);

        bar.liveMusic = true;
        System.out.println("Live Music: " + bar.liveMusic);

        bar.specialtyDrink = "Mojito";
        System.out.println("Specialty Drink: " + bar.specialtyDrink);

        bar.staffCount = 25;
        System.out.println("Staff Count: " + bar.staffCount);
        bar.openBar();
        bar.closeBar();
        bar.serveSpecial();

        System.out.println("\n====================");

		
		

        PremiumBar bar1 = new PremiumBar();
        System.out.println("Printing Bar1 Information");

        bar1.name = "Sky Lounge";
        System.out.println("Name: " + bar1.name);

        bar1.location = "Mumbai";
        System.out.println("Location: " + bar1.location);

        bar1.capacity = 150;
        System.out.println("Capacity: " + bar1.capacity);

        bar1.owner = "Owner B";
        System.out.println("Owner: " + bar1.owner);

        bar1.rating = 4;
        System.out.println("Rating: " + bar1.rating);

        bar1.liveMusic = false;
        System.out.println("Live Music: " + bar1.liveMusic);

        bar1.specialtyDrink = "Cocktail";
        System.out.println("Specialty Drink: " + bar1.specialtyDrink);

        bar1.staffCount = 20;
        System.out.println("Staff Count: " + bar1.staffCount);
        bar1.openBar();
        bar1.closeBar();
        bar1.serveSpecial();

        System.out.println("\n====================");

		
		

        Bar bar2 = new PremiumBar();
        bar2.name = "City Bar";
        System.out.println("Name: " + bar2.name);

        bar2.location = "Delhi";
        System.out.println("Location: " + bar2.location);

        bar2.capacity = 100;
        System.out.println("Capacity: " + bar2.capacity);
        bar2.openBar();
        bar2.closeBar();

        System.out.println("\n====================");

		
		

        Bar bar3 = new PremiumBar();
        bar3.name = "Metro Bar";
        System.out.println("Name: " + bar3.name);

        bar3.location = "Chennai";
        System.out.println("Location: " + bar3.location);

        bar3.capacity = 120;
        System.out.println("Capacity: " + bar3.capacity);
        bar3.openBar();
        bar3.closeBar();
    }
}