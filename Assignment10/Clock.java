class Clock {

    String color;
    int price;
    boolean working;

    Clock() {
        System.out.println("Clock no-arg const...");
    }

    void getBrands() {
        System.out.println("executing getBrands in Clock");
    }

    void saveTimings() {
        System.out.println("executing saveTimings in Clock");
    }
}