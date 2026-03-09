class Paper {

    String brand;
    String type;
    String color;
    String size;
    String quality;
    String finish;
    String manufacturer;
    String countryOfOrigin;
    double price;
    int quantity;
    boolean isRecycled;
    boolean isAvailable;
    String gsm;
    String packagingType;
    String usageType;
    String texture;
    int sheetsPerPack;
    double rating;
    boolean premiumQuality;
    String certification;

    public Paper(String brand, String type, String color, String size,
                 String quality, String finish, String manufacturer,
                 String countryOfOrigin, double price, int quantity,
                 boolean isRecycled, boolean isAvailable, String gsm,
                 String packagingType, String usageType, String texture,
                 int sheetsPerPack, double rating,
                 boolean premiumQuality, String certification) {

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.size = size;
        this.quality = quality;
        this.finish = finish;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.quantity = quantity;
        this.isRecycled = isRecycled;
        this.isAvailable = isAvailable;
        this.gsm = gsm;
        this.packagingType = packagingType;
        this.usageType = usageType;
        this.texture = texture;
        this.sheetsPerPack = sheetsPerPack;
        this.rating = rating;
        this.premiumQuality = premiumQuality;
        this.certification = certification;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Quality: " + quality);
        System.out.println("Finish: " + finish);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country: " + countryOfOrigin);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Recycled: " + isRecycled);
        System.out.println("Available: " + isAvailable);
        System.out.println("GSM: " + gsm);
        System.out.println("Packaging: " + packagingType);
        System.out.println("Usage: " + usageType);
        System.out.println("Texture: " + texture);
        System.out.println("Sheets Per Pack: " + sheetsPerPack);
        System.out.println("Rating: " + rating);
        System.out.println("Premium Quality: " + premiumQuality);
        System.out.println("Certification: " + certification);
        System.out.println("-----------------------------------");
    }
}