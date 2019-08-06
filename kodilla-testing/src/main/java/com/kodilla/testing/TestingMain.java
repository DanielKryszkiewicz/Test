package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator(7, 3);
        calc.add();
        calc.subtract();
        int resultAdd = calc.add();
        int resultSubtract = calc.subtract();

        if (resultAdd == 10) {
            System.out.println("TEST OK");
        } else {
            System.out.println("TEST FAILED!");
        }
        if (resultSubtract == 4) {
            System.out.println("TEST OK");
        } else {
            System.out.println("TEST FAILED");
        }
    }
}



