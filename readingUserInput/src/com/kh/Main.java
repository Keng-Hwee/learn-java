package com.kh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt(); // checks to see if the next input is an integer

        if(hasNextInt){
            int yearOfBirth = scanner.nextInt(); //auto convert user input to integer
            // Only needed after using nextInt or nextDouble or whatever except for nextLine
            scanner.nextLine(); //handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine(); // To read a line of input from console
            int age = 2019 - yearOfBirth;

            if(age >=0 && age<= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }
        scanner.close();
    }
}
