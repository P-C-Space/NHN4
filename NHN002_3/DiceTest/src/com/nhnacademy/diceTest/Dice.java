package com.nhnacademy.diceTest;

public class Dice {
    private int number;

    public int getNumber() {
        return number;
    }

    public Dice(int number) {
        if (number <= 0 || number >= 7) {
            throw new IllegalArgumentException("Invalid Number");
        }

        this.number = number;
    }

}
