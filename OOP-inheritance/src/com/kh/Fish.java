package com.kh;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1,1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {
        System.out.println("fish rests");
    }

    private void moveMuscles() {
        System.out.println("fish moves the muscles");
    }

    private void moveBackFin() {
        System.out.println("fish moves the back fins");
    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
