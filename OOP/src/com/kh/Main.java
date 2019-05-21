package com.kh;

public class Main {

    public static void main(String[] args) {

        bankAccountChallengeOutput();

        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("abc");
        System.out.println("Model is " + porsche.getModel());



    }

    public static int bankAccountChallengeOutput(){
        Account bobsAccount = new Account("12345", 0.0, "Bob Brown", "bob@awesomemail.com", "999");
        Account defaultAccount = new Account();

        bobsAccount.withdraw(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdraw(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdraw(100.0);

        return 0;
    }
}
