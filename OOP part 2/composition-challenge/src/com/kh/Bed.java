package com.kh;

public class Bed {
    private Dimensions dimensions;
    private String brand;
    private String material;
    private String type;
    private String bedSheetColour;

    public Bed(Dimensions dimensions, String brand, String material, String type, String bedSheetColour) {
        this.dimensions = dimensions;
        this.brand = brand;
        this.material = material;
        this.type = type;
        this.bedSheetColour = bedSheetColour;
    }

    public void changeBedSheet(String color) {
        System.out.println("Changed bedsheet");
        this.bedSheetColour = color;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getBrand() {
        return brand;
    }

    public String getMaterial() {
        return material;
    }

    public String getType() {
        return type;
    }

    public String getBedSheetColour() {
        return bedSheetColour;
    }
}
