class Stand {

    String standType;
    String material;
    String color;
    String brand;
    String modelNumber;
    double price;
    int heightCm;
    int weightCapacityKg;
    boolean foldable;
    boolean adjustable;
    String usageType;
    String countryOfOrigin;
    String manufacturer;
    int warrantyYears;
    String finishType;
    String mountingType;
    boolean portable;
    String compatibleDevices;
    String shape;
    boolean available;

    public Stand(String standType, String material, String color, String brand,
                 String modelNumber, double price, int heightCm, int weightCapacityKg,
                 boolean foldable, boolean adjustable, String usageType,
                 String countryOfOrigin, String manufacturer, int warrantyYears,
                 String finishType, String mountingType, boolean portable,
                 String compatibleDevices, String shape, boolean available) {

        this.standType = standType;
        this.material = material;
        this.color = color;
        this.brand = brand;
        this.modelNumber = modelNumber;
        this.price = price;
        this.heightCm = heightCm;
        this.weightCapacityKg = weightCapacityKg;
        this.foldable = foldable;
        this.adjustable = adjustable;
        this.usageType = usageType;
        this.countryOfOrigin = countryOfOrigin;
        this.manufacturer = manufacturer;
        this.warrantyYears = warrantyYears;
        this.finishType = finishType;
        this.mountingType = mountingType;
        this.portable = portable;
        this.compatibleDevices = compatibleDevices;
        this.shape = shape;
        this.available = available;
    }

    void display() {
        System.out.println("Stand Type: " + standType);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Price: " + price);
        System.out.println("Height (cm): " + heightCm);
        System.out.println("Weight Capacity (kg): " + weightCapacityKg);
        System.out.println("Foldable: " + foldable);
        System.out.println("Adjustable: " + adjustable);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Warranty Years: " + warrantyYears);
        System.out.println("Finish Type: " + finishType);
        System.out.println("Mounting Type: " + mountingType);
        System.out.println("Portable: " + portable);
        System.out.println("Compatible Devices: " + compatibleDevices);
        System.out.println("Shape: " + shape);
        System.out.println("Available: " + available);
        System.out.println("-----------------------------------");
    }
}