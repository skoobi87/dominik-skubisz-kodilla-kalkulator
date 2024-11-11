package com.kodilla.kalkulator;

public class Calculator {

    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1 +  num2;
    }
    public double sub() {
        return num1 - num2;
    }
    @Override
    public String toString() {
        return "Liczba pierwsza: " + num1 + "\nLiczba druga " + num2;

    }
}