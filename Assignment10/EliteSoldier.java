class EliteSoldier extends Soldier {

    String specialization;
    int missions;
    String weapon;
    boolean nightVision;
    String unit;

    EliteSoldier() {
        super();
        System.out.println("no-arg const of EliteSoldier");
    }

    void specialOperation() {
        System.out.println("executing specialOperation in EliteSoldier");
    }
}