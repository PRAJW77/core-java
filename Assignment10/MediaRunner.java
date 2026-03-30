class MediaRunner {

    public static void main(String... values) {

        DigitalMedia media = new DigitalMedia();
        System.out.println("Printing Media Information ");

        media.type = "Video";
        System.out.println("Type: " + media.type);

        media.format = "MP4";
        System.out.println("Format: " + media.format);

        media.duration = 120;
        System.out.println("Duration: " + media.duration);

        media.platform = "YouTube";
        System.out.println("Platform: " + media.platform);

        media.size = 500;
        System.out.println("Size: " + media.size);

        media.subscription = true;
        System.out.println("Subscription: " + media.subscription);

        media.creator = "Creator A";
        System.out.println("Creator: " + media.creator);

        media.views = 1000000;
        System.out.println("Views: " + media.views);
        media.play();
        media.stop();
        media.stream();

        System.out.println("\n====================");


        DigitalMedia media1 = new DigitalMedia();
        System.out.println("Printing Media1 Information");

        media1.type = "Audio";
        System.out.println("Type: " + media1.type);

        media1.format = "MP3";
        System.out.println("Format: " + media1.format);

        media1.duration = 5;
        System.out.println("Duration: " + media1.duration);

        media1.platform = "Spotify";
        System.out.println("Platform: " + media1.platform);

        media1.size = 10;
        System.out.println("Size: " + media1.size);

        media1.subscription = false;
        System.out.println("Subscription: " + media1.subscription);

        media1.creator = "Creator B";
        System.out.println("Creator: " + media1.creator);

        media1.views = 500000;
        System.out.println("Views: " + media1.views);
        media1.play();
        media1.stop();
        media1.stream();

        System.out.println("\n====================");


        Media media2 = new DigitalMedia();
        media2.type = "Movie";
        System.out.println("Type: " + media2.type);

        media2.format = "MKV";
        System.out.println("Format: " + media2.format);

        media2.duration = 180;
        System.out.println("Duration: " + media2.duration);
        media2.play();
        media2.stop();

        System.out.println("\n====================");


        Media media3 = new DigitalMedia();
        media3.type = "Podcast";
        System.out.println("Type: " + media3.type);

        media3.format = "MP3";
        System.out.println("Format: " + media3.format);

        media3.duration = 60;
        System.out.println("Duration: " + media3.duration);
        media3.play();
        media3.stop();
    }
}