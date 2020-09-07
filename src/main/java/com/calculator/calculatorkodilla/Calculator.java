package com.calculator.calculatorkodilla;

public class Calculator {
    public void addition(){
        int a = 5;
        int b = 7;
        int c = a +b;

        System.out.println("Wynik dodawania liczb:\n" + a + " oraz " + b +
                "\nwynosi: " + c);
    }

    public void subtraction(){
        int x = 250;
        int y = 15;
        int z = x - y;

        System.out.println("Wynik odejmowanie liczb:\n" + y + " od liczby " + x +
                "\nwynosi: " + z);
    }

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        calculator.addition();
        System.out.println();
        calculator.subtraction();
    }
}