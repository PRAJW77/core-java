class WarRunner {

    public static void main(String... values) {

        ModernWar war = new ModernWar();
        System.out.println("Printing War Information ");

        war.warName = "World War 2";
        System.out.println("War Name: " + war.warName);

        war.noOfSoldiers = 500000;
        System.out.println("No Of Soldiers: " + war.noOfSoldiers);

        war.location = "Global";
        System.out.println("Location: " + war.location);

        war.country = "Multiple Nations";
        System.out.println("Country: " + war.country);

        war.tanks = 1000;
        System.out.println("Tanks: " + war.tanks);

        war.missiles = 500;
        System.out.println("Missiles: " + war.missiles);

        war.nuclearWeapons = true;
        System.out.println("Nuclear Weapons: " + war.nuclearWeapons);

        war.commander = "Commander A";
        System.out.println("Commander: " + war.commander);
        war.startWar();
        war.endWar();
        war.useTechnology();

        System.out.println("\n====================");


        ModernWar war1 = new ModernWar();
        System.out.println("Printing War1 Information");

        war1.warName = "Border Conflict";
        System.out.println("War Name: " + war1.warName);

        war1.noOfSoldiers = 200000;
        System.out.println("No Of Soldiers: " + war1.noOfSoldiers);

        war1.location = "Border Area";
        System.out.println("Location: " + war1.location);

        war1.country = "Country X";
        System.out.println("Country: " + war1.country);

        war1.tanks = 500;
        System.out.println("Tanks: " + war1.tanks);

        war1.missiles = 200;
        System.out.println("Missiles: " + war1.missiles);

        war1.nuclearWeapons = false;
        System.out.println("Nuclear Weapons: " + war1.nuclearWeapons);

        war1.commander = "Commander B";
        System.out.println("Commander: " + war1.commander);
        war1.startWar();
        war1.endWar();
        war1.useTechnology();

        System.out.println("\n====================");


        War war2 = new ModernWar();
        war2.warName = "Cold War";
        System.out.println("War Name: " + war2.warName);

        war2.noOfSoldiers = 300000;
        System.out.println("No Of Soldiers: " + war2.noOfSoldiers);

        war2.location = "Europe";
        System.out.println("Location: " + war2.location);
        war2.startWar();
        war2.endWar();

        System.out.println("\n====================");


        War war3 = new ModernWar();
        war3.warName = "Cyber War";
        System.out.println("War Name: " + war3.warName);

        war3.noOfSoldiers = 100000;
        System.out.println("No Of Soldiers: " + war3.noOfSoldiers);

        war3.location = "Online";
        System.out.println("Location: " + war3.location);
        war3.startWar();
        war3.endWar();
    }
}