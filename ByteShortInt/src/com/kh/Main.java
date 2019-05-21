package com.kh;

public class Main {

    public static void main(String[] args) {
	    int number = 1_000 + 2_000_00;
        System.out.println(number);

        byte myByteValue = 100;
        int testint = 1;
        byte byteTest = (byte) (myByteValue + testint);
        System.out.println(byteTest);

        //short is another type

        long test = byteTest + 1;
        System.out.println(test);
    }
}
