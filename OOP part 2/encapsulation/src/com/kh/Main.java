package com.kh;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "kh";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage =10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim", 500, "Sword");
        System.out.println("Initial health is " + player.getHealth());

    }
}