class Bar {

    String name;
    String location;
    int capacity;

    Bar() {
        System.out.println("Bar no-arg const...");
    }

    void openBar() {
        System.out.println("executing openBar in Bar");
    }

    void closeBar() {
        System.out.println("executing closeBar in Bar");
    }
}