class Factory {

    String name;
    String location;
    int workers;

    Factory() {
        System.out.println("Factory no-arg const...");
    }

    void produce() {
        System.out.println("executing produce in Factory");
    }

    void supply() {
        System.out.println("executing supply in Factory");
    }
}