package com.kh;

public class Desk {

    private Dimensions dimensions;
    private String material;

    public Desk(Dimensions dimensions, String material) {
        this.dimensions = dimensions;
        this.material = material;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getMaterial() {
        return material;
    }
}
