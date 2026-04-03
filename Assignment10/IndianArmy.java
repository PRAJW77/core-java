class IndianArmy extends Army {

    String generalName;

    IndianArmy() {
        super(); // explicitly calling no-arg const of Army
        System.out.println("no-arg const of IndianArmy");
    }

    void surveillance() {
        System.out.println("executing surveillance in IndianArmy");
    }
}