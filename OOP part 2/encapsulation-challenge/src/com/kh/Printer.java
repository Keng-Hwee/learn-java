package com.kh;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean duplex) {
        if(tonerLevel >= 0 && tonerLevel<=100) {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.duplex = duplex;
    }

    public void print(int numberOfPagesToPrint) {
        if(numberOfPagesToPrint > this.tonerLevel) {
            System.out.println("Error! not enough toner level");
        } else {
            this.tonerLevel -= numberOfPagesToPrint;
            this.numberOfPagesPrinted += numberOfPagesToPrint;
        }
    }

    public void refillToner() {
        this.tonerLevel = 100;
    }
}
