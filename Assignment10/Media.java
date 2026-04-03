class Media {

    String type;
    String format;
    int duration;

    Media() {
        System.out.println("Media no-arg const...");
    }

    void play() {
        System.out.println("executing play in Media");
    }

    void stop() {
        System.out.println("executing stop in Media");
    }
}