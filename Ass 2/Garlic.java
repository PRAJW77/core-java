class Garlic {

    String variety;
    String originCountry;
    String color;
    String size;
    double pricePerKg;
    int stockKg;
    boolean organic;
    boolean peeled;
    String supplierName;
    String packagingType;
    String grade;
    String harvestSeason;
    String storageType;
    int shelfLifeDays;
    double moistureContent;
    String flavorStrength;
    boolean exportQuality;
    String certification;
    String distributor;
    boolean available;

    public Garlic(String variety, String originCountry, String color, String size,
                  double pricePerKg, int stockKg, boolean organic, boolean peeled,
                  String supplierName, String packagingType, String grade,
                  String harvestSeason, String storageType, int shelfLifeDays,
                  double moistureContent, String flavorStrength, boolean exportQuality,
                  String certification, String distributor, boolean available) {

        this.variety = variety;
        this.originCountry = originCountry;
        this.color = color;
        this.size = size;
        this.pricePerKg = pricePerKg;
        this.stockKg = stockKg;
        this.organic = organic;
        this.peeled = peeled;
        this.supplierName = supplierName;
        this.packagingType = packagingType;
        this.grade = grade;
        this.harvestSeason = harvestSeason;
        this.storageType = storageType;
        this.shelfLifeDays = shelfLifeDays;
        this.moistureContent = moistureContent;
        this.flavorStrength = flavorStrength;
        this.exportQuality = exportQuality;
        this.certification = certification;
        this.distributor = distributor;
        this.available = available;
    }

    void display() {
        System.out.println("Variety: " + variety);
        System.out.println("Origin Country: " + originCountry);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Price Per Kg: " + pricePerKg);
        System.out.println("Stock Kg: " + stockKg);
        System.out.println("Organic: " + organic);
        System.out.println("Peeled: " + peeled);
        System.out.println("Supplier Name: " + supplierName);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Grade: " + grade);
        System.out.println("Harvest Season: " + harvestSeason);
        System.out.println("Storage Type: " + storageType);
        System.out.println("Shelf Life Days: " + shelfLifeDays);
        System.out.println("Moisture Content: " + moistureContent);
        System.out.println("Flavor Strength: " + flavorStrength);
        System.out.println("Export Quality: " + exportQuality);
        System.out.println("Certification: " + certification);
        System.out.println("Distributor: " + distributor);
        System.out.println("Available: " + available);
        System.out.println("-----------------------------------");
    }
}