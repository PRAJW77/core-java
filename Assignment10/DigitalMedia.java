class DigitalMedia extends Media {

    String platform;
    int size;
    boolean subscription;
    String creator;
    int views;

    DigitalMedia() {
        super();
        System.out.println("no-arg const of DigitalMedia");
    }

    void stream() {
        System.out.println("executing stream in DigitalMedia");
    }
}