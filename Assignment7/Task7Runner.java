class Task7Runner {

    public static void main(String[] args) {

        String[] furnitures = new String[3];
        furnitures[0] = "Sofa";
        furnitures[1] = "Bed";
        furnitures[2] = "Table";

        Wood wood1 = new Wood("Sandalwood",150);
        Wood wood2 = new Wood("Bamboo",200);
        Wood wood3 = new Wood("Rosewood",130);

        Wood[] woods = new Wood[3];
        woods[0] = wood1;
        woods[1] = wood2;
        woods[2] = wood3;

        Carpenter carpenter = new Carpenter(furnitures, woods);
        carpenter.printInfo();

        //======Printer Section=======

        String[] printerTasks = new String[2];
        printerTasks[0] = "Print Document";
        printerTasks[1] = "Scan Document";

        PrinterItem p1 = new PrinterItem("HP LaserJet",15000);
        PrinterItem p2 = new PrinterItem("Canon Pixma",12000);

        PrinterItem[] printers = new PrinterItem[2];
        printers[0] = p1;
        printers[1] = p2;

        Printer printer = new Printer(printerTasks, printers);
        printer.printInfo();
		
		// ===== Painter Section =====

		String[] painterWorks = new String[2];
		painterWorks[0] = "Wall Painting";
		painterWorks[1] = "Art Design";

		Paint paint1 = new Paint("Asian Paints", 1200);
		Paint paint2 = new Paint("Berger Paints", 1000);

		Paint[] paints = new Paint[2];
		paints[0] = paint1;
		paints[1] = paint2;

		Painter painter = new Painter(painterWorks, paints);
		painter.printInfo();
		
		// ===== Server Section =====

		String[] serverServices = new String[2];
		serverServices[0] = "Web Hosting";
		serverServices[1] = "Database Service";

		ServerItem s1 = new ServerItem("Dell PowerEdge", 80000);
		ServerItem s2 = new ServerItem("HP ProLiant", 75000);

		ServerItem[] servers = new ServerItem[2];
		servers[0] = s1;
		servers[1] = s2;

		Server server = new Server(serverServices, servers);
		server.printInfo();
		
		String[] jamoonFlavors = new String[2];
		jamoonFlavors[0] = "Gulab Jamoon";
		jamoonFlavors[1] = "Kala Jamoon";

		JItem j1 = new JItem("Small Jamoon", 50);
		JItem j2 = new JItem("Big Jamoon", 80);

		JItem[] items = new JItem[2];
		items[0] = j1;
		items[1] = j2;

		Jamoon jamoon = new Jamoon(jamoonFlavors, items);
		jamoon.printInfo();
		
		String[] halwaOrders = new String[2];
		halwaOrders[0] = "Take Away";
		halwaOrders[1] = "Dine In";

		CarrotHalwaItem h1 = new CarrotHalwaItem("Regular Carrot Halwa",120);
		CarrotHalwaItem h2 = new CarrotHalwaItem("Dry Fruit Carrot Halwa", 180);
	
		CarrotHalwaItem[] halwas = new CarrotHalwaItem[2];
		halwas[1] = h1;
		halwas[0] = h2;

		CarrotHalwa carrotHalwa = new CarrotHalwa(halwaOrders, halwas);
		carrotHalwa.printInfo();
				
		
    }
}