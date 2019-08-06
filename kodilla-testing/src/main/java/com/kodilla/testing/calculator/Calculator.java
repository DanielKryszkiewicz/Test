package com.kodilla.testing.calculator;

public class Calculator {
    int a = 5;
    int b = 6;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;

    }
    public int add(){
        return a+b;
    }
    public int subtract(){
        return a-b;
    }
    public static void main(String[] args){
        Calculator calc = new Calculator(7,3);
        calc.add();
        calc.subtract();
    }
}
