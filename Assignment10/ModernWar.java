class ModernWar extends War {

    String country;
    int tanks;
    int missiles;
    boolean nuclearWeapons;
    String commander;

    ModernWar() {
        super();
        System.out.println("no-arg const of ModernWar");
    }

    void useTechnology() {
        System.out.println("executing modern technology in war");
    }
}