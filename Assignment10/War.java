class War {

    String warName;
    int noOfSoldiers;
    String location;

    War() {
        System.out.println("War no-arg const...");
    }

    void startWar() {
        System.out.println("executing startWar in War");
    }

    void endWar() {
        System.out.println("executing endWar in War");
    }
}