package com.kh;

public class Main {

    public static void main(String[] args) {

//        for(init; termination; increment) {
//
//        }

        for(int i=0; i<6; i++){
            double interestRate = (double) i;
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, interestRate));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * interestRate / 100);
    }
}
