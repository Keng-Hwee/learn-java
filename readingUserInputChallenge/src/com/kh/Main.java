package com.kh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int validNumberCount = 1;
        int inputNumber = 0;
        int total = 0;
        boolean hasNextInt = true;

        while(validNumberCount < 11) {
            System.out.println("Enter number #" + validNumberCount);
            hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                inputNumber = scanner.nextInt();
                validNumberCount++;
                total += inputNumber;
            } else {
                System.out.println("Invalid integer");
            }
            scanner.nextLine();
        }

        System.out.println("Total: " + total);

        scanner.close();
    }
}
