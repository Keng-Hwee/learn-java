package com.kh;

public class Main {

    public static void main(String[] args) {
	    ITelephone myPhone;  // OR DeskPhone = myPhone
        myPhone = new DeskPhone(999);
        myPhone.powerOn();
        myPhone.callPhone(1234);
        myPhone.answer();

        System.out.println("===================================");

        myPhone = new MobilePhone(995);
        myPhone.powerOn();
        myPhone.callPhone(995);
        myPhone.answer();
    }
}
