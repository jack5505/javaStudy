package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calculator calculator = new CalculatorImpl();

        System.out.println(calculator.run("Hello"));
        System.out.println(calculator.run("World"));
        System.out.println(calculator.run("Hello"));
        System.out.println(calculator.run("World"));
    }
}
