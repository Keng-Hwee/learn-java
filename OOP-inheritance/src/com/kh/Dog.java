package com.kh;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // note that brain and body defaulted to 1 since a dog definitely has a brain and body
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog chews");
    }

    @Override
    public void eat() {
        chew();
    }

    public void walk() {
        System.out.println("dog walks");
        move(5);
    }

    public void run() {
        System.out.println("dog runs");
        move(10);
    }
}
