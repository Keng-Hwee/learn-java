package com.kh;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Note that arraylist does not support primitive types!
        // They only support classes object.
        // Solution: Use autoboxing (in-built primitive datatype but is a class, like String)
        //           and changing the code during compile time to make the code run correctly,
        //           while making the code easy for user.

        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(5);
        intArrayList.add(10);
        intArrayList.add(15);
        System.out.println(intArrayList.get(0));
        System.out.println(intArrayList.get(1));
        System.out.println(intArrayList.get(2));

        // Integer myIntValue = new Integer(10);  --> No need to do this
        Integer myIntValue = 56;  // Java made it easy for us
        int myInt = myIntValue;   // Works too

    }
}
