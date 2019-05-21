package com.kh;

public class Main {

    public static void main(String[] args) {
	    Shelf myShelf = new Shelf(150, new Dimensions(200,60,30), "Wood");
	    Bed myBed = new Bed(new Dimensions(30,190,50), "IDK", "Wood", "Single", "Blue");
	    Desk myDesk = new Desk(new Dimensions(70, 160, 50), "Wood");
        Room myRoom = new Room(myBed, myDesk, myShelf);

        myRoom.changeBedSheet("White");
    }
}
