class Pepper {

    String brand;
    String type;
    String color;
    String origin;
    double price;
    int quantity;
    boolean isOrganic;
    String packagingType;
    String grade;
    String supplier;
    double weight;
    boolean isAvailable;
    String flavor;
    String form;
    String harvestYear;
    String certification;
    boolean exportQuality;
    String storageType;
    double rating;
    boolean premiumQuality;

    public Pepper(String brand, String type, String color, String origin,
                  double price, int quantity, boolean isOrganic,
                  String packagingType, String grade, String supplier,
                  double weight, boolean isAvailable, String flavor,
                  String form, String harvestYear, String certification,
                  boolean exportQuality, String storageType,
                  double rating, boolean premiumQuality) {

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.origin = origin;
        this.price = price;
        this.quantity = quantity;
        this.isOrganic = isOrganic;
        this.packagingType = packagingType;
        this.grade = grade;
        this.supplier = supplier;
        this.weight = weight;
        this.isAvailable = isAvailable;
        this.flavor = flavor;
        this.form = form;
        this.harvestYear = harvestYear;
        this.certification = certification;
        this.exportQuality = exportQuality;
        this.storageType = storageType;
        this.rating = rating;
        this.premiumQuality = premiumQuality;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Origin: " + origin);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Organic: " + isOrganic);
        System.out.println("Packaging: " + packagingType);
        System.out.println("Grade: " + grade);
        System.out.println("Supplier: " + supplier);
        System.out.println("Weight: " + weight);
        System.out.println("Available: " + isAvailable);
        System.out.println("Flavor: " + flavor);
        System.out.println("Form: " + form);
        System.out.println("Harvest Year: " + harvestYear);
        System.out.println("Certification: " + certification);
        System.out.println("Export Quality: " + exportQuality);
        System.out.println("Storage Type: " + storageType);
        System.out.println("Rating: " + rating);
        System.out.println("Premium Quality: " + premiumQuality);
        System.out.println("-----------------------------------");
    }
}