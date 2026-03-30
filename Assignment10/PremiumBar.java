class PremiumBar extends Bar {

    String owner;
    int rating;
    boolean liveMusic;
    String specialtyDrink;
    int staffCount;

    PremiumBar() {
        super();
        System.out.println("no-arg const of PremiumBar");
    }

    void serveSpecial() {
        System.out.println("executing serveSpecial in PremiumBar");
    }
}