class SoldierRunner {

    public static void main(String... values) {

        EliteSoldier soldier = new EliteSoldier();
        System.out.println("Printing Soldier Information ");

        soldier.name = "Ravi";
        System.out.println("Name: " + soldier.name);

        soldier.age = 30;
        System.out.println("Age: " + soldier.age);

        soldier.rank = "Captain";
        System.out.println("Rank: " + soldier.rank);

        soldier.specialization = "Sniper";
        System.out.println("Specialization: " + soldier.specialization);

        soldier.missions = 50;
        System.out.println("Missions: " + soldier.missions);

        soldier.weapon = "Rifle";
        System.out.println("Weapon: " + soldier.weapon);

        soldier.nightVision = true;
        System.out.println("Night Vision: " + soldier.nightVision);

        soldier.unit = "Special Forces";
        System.out.println("Unit: " + soldier.unit);
        soldier.fight();
        soldier.train();
        soldier.specialOperation();

        System.out.println("\n====================");
		
		
		


        EliteSoldier soldier1 = new EliteSoldier();
        System.out.println("Printing Soldier1 Information");

        soldier1.name = "Arjun";
        System.out.println("Name: " + soldier1.name);

        soldier1.age = 28;
        System.out.println("Age: " + soldier1.age);

        soldier1.rank = "Lieutenant";
        System.out.println("Rank: " + soldier1.rank);

        soldier1.specialization = "Commando";
        System.out.println("Specialization: " + soldier1.specialization);

        soldier1.missions = 30;
        System.out.println("Missions: " + soldier1.missions);

        soldier1.weapon = "Pistol";
        System.out.println("Weapon: " + soldier1.weapon);

        soldier1.nightVision = false;
        System.out.println("Night Vision: " + soldier1.nightVision);

        soldier1.unit = "Infantry";
        System.out.println("Unit: " + soldier1.unit);
        soldier1.fight();
        soldier1.train();
        soldier1.specialOperation();

        System.out.println("\n====================");

		
		
		

        Soldier soldier2 = new EliteSoldier();
        soldier2.name = "Kiran";
        System.out.println("Name: " + soldier2.name);

        soldier2.age = 35;
        System.out.println("Age: " + soldier2.age);

        soldier2.rank = "Major";
        System.out.println("Rank: " + soldier2.rank);
        soldier2.fight();
        soldier2.train();

        System.out.println("\n====================");


		
		
        Soldier soldier3 = new EliteSoldier();
        soldier3.name = "Vijay";
        System.out.println("Name: " + soldier3.name);

        soldier3.age = 32;
        System.out.println("Age: " + soldier3.age);

        soldier3.rank = "Colonel";
        System.out.println("Rank: " + soldier3.rank);
        soldier3.fight();
        soldier3.train();
    }
}