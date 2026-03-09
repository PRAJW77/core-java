class WallPaper {

    String brand;
    String type;
    String color;
    String pattern;
    String material;
    String finish;
    String size;
    String style;
    String roomType;
    String countryOfOrigin;
    String manufacturer;
    String designCode;
    double price;
    int rollLength;
    int rollWidth;
    int warrantyYears;
    boolean washable;
    boolean peelAndStick;
    boolean ecoFriendly;
    boolean fireResistant;

    public WallPaper(String brand, String type, String color, String pattern, String material,
                     String finish, String size, String style, String roomType,
                     String countryOfOrigin, String manufacturer, String designCode,
                     double price, int rollLength, int rollWidth, int warrantyYears,
                     boolean washable, boolean peelAndStick, boolean ecoFriendly,
                     boolean fireResistant) {

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.pattern = pattern;
        this.material = material;
        this.finish = finish;
        this.size = size;
        this.style = style;
        this.roomType = roomType;
        this.countryOfOrigin = countryOfOrigin;
        this.manufacturer = manufacturer;
        this.designCode = designCode;
        this.price = price;
        this.rollLength = rollLength;
        this.rollWidth = rollWidth;
        this.warrantyYears = warrantyYears;
        this.washable = washable;
        this.peelAndStick = peelAndStick;
        this.ecoFriendly = ecoFriendly;
        this.fireResistant = fireResistant;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Pattern: " + pattern);
        System.out.println("Material: " + material);
        System.out.println("Finish: " + finish);
        System.out.println("Size: " + size);
        System.out.println("Style: " + style);
        System.out.println("Room Type: " + roomType);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Design Code: " + designCode);
        System.out.println("Price: " + price);
        System.out.println("Roll Length: " + rollLength);
        System.out.println("Roll Width: " + rollWidth);
        System.out.println("Warranty Years: " + warrantyYears);
        System.out.println("Washable: " + washable);
        System.out.println("Peel And Stick: " + peelAndStick);
        System.out.println("Eco Friendly: " + ecoFriendly);
        System.out.println("Fire Resistant: " + fireResistant);
    }
}