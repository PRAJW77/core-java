class FactoryRunner {

    public static void main(String... values) {

        SmartFactory factory = new SmartFactory();
        System.out.println("Printing Factory Information ");

        factory.name = "ABC Factory";
        System.out.println("Name: " + factory.name);

        factory.location = "Bangalore";
        System.out.println("Location: " + factory.location);

        factory.workers = 500;
        System.out.println("Workers: " + factory.workers);

        factory.technology = "AI";
        System.out.println("Technology: " + factory.technology);

        factory.machines = 100;
        System.out.println("Machines: " + factory.machines);

        factory.automation = true;
        System.out.println("Automation: " + factory.automation);

        factory.owner = "Owner A";
        System.out.println("Owner: " + factory.owner);

        factory.productionRate = 1000;
        System.out.println("Production Rate: " + factory.productionRate);
        factory.produce();
        factory.supply();
        factory.monitor();

        System.out.println("\n====================");


        SmartFactory factory1 = new SmartFactory();
        System.out.println("Printing Factory1 Information");

        factory1.name = "XYZ Factory";
        System.out.println("Name: " + factory1.name);

        factory1.location = "Mumbai";
        System.out.println("Location: " + factory1.location);

        factory1.workers = 300;
        System.out.println("Workers: " + factory1.workers);

        factory1.technology = "Robotics";
        System.out.println("Technology: " + factory1.technology);

        factory1.machines = 80;
        System.out.println("Machines: " + factory1.machines);

        factory1.automation = false;
        System.out.println("Automation: " + factory1.automation);

        factory1.owner = "Owner B";
        System.out.println("Owner: " + factory1.owner);

        factory1.productionRate = 700;
        System.out.println("Production Rate: " + factory1.productionRate);
        factory1.produce();
        factory1.supply();
        factory1.monitor();

        System.out.println("\n====================");


        Factory factory2 = new SmartFactory();
        factory2.name = "DEF Factory";
        System.out.println("Name: " + factory2.name);

        factory2.location = "Chennai";
        System.out.println("Location: " + factory2.location);

        factory2.workers = 200;
        System.out.println("Workers: " + factory2.workers);
        factory2.produce();
        factory2.supply();

        System.out.println("\n====================");


        Factory factory3 = new SmartFactory();
        factory3.name = "GHI Factory";
        System.out.println("Name: " + factory3.name);

        factory3.location = "Delhi";
        System.out.println("Location: " + factory3.location);

        factory3.workers = 150;
        System.out.println("Workers: " + factory3.workers);
        factory3.produce();
        factory3.supply();
    }
}