class IndianArmyRunner {

    public static void main(String... values) {

        IndianArmy indianArmy = new IndianArmy();
        System.out.println(indianArmy.baseCamp);
        System.out.println(indianArmy.noOfSoldiers);
        System.out.println(indianArmy.generalName);

        indianArmy.defence();
        indianArmy.attack();
        indianArmy.surveillance();

        // parent creating the child class
        Army army = new IndianArmy();
        System.out.println(army.baseCamp);
        System.out.println(army.noOfSoldiers);
        // System.out.println(army.generalName);
        army.attack();
        army.defence();
    }
}