package com.kh;

import java.awt.*;

public class Shelf {

    private int capacity;
    private Dimensions dimensions;
    private String material;

    public Shelf(int capacity, Dimensions dimensions, String material) {
        this.capacity = capacity;
        this.dimensions = dimensions;
        this.material = material;
    }

    public void addBooks(int numberOfBooks) {
        System.out.println("Added " + numberOfBooks + " books.");
    }

    public int getCapacity() {
        return capacity;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getMaterial() {
        return material;
    }
}
