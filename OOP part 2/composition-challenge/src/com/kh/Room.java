package com.kh;

public class Room {
    private Bed bed;
    private Desk desk;
    private Shelf shelf;

    public Room(Bed bed, Desk desk, Shelf shelf) {
        this.bed = bed;
        this.desk = desk;
        this.shelf = shelf;
    }

    public void changeBedSheet(String color) {
        getBed().changeBedSheet(color);
    }

    private Bed getBed() {
        return bed;
    }

    private Desk getDesk() {
        return desk;
    }

    private Shelf getShelf() {
        return shelf;
    }
}
