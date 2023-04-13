package com.ua.robot.homework26;

public class Main {

    public static void main(String[] args) {

        double number = -2.5;

        try {
            double square = calculateSquare(number);
            System.out.println("Square of number " + number + " is " + square);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static double calculateSquare(double number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Number is less than zero!");
        }
        return number * number;
    }
}
