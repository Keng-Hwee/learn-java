package com.kh;

public class Main {

    public static void main(String[] args) {

        int switchValue = 6;

        switch(switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;

            case 2:
                System.out.println("value is 2");
                break;

            case 3: case 4: case 5:
                System.out.println("value is 3, 4 or 5");
                break;

            default:
                System.out.println("Not 1,2,3,4 or 5");
                break;
        }

        System.out.println("finished switch statement");
    }
}
