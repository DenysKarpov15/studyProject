package com.ua.robot.homework7;

public class Main {

    public static void main(String[] args) {

        System.out.println(getCube(7));
        System.out.println(getNumberInDegree(3, 3));

        printSymbolNumberTimes(5);  // Print stars by default

        printSymbolNumberTimes("%", 11);  // Print chosen symbol
    }

    // First task
    static int getCube(int number) {  // Simple method that return cube
        return getNumberInDegree(number, 3);
    }

    static int getNumberInDegree(int number, int degree) {  // More general method of exponentiation
        if (degree == 1) {
            return number;
        } else {
            return number * getNumberInDegree(number, degree - 1);  // Practice of recursion
        }
    }

    // Second task
    static void printSymbolNumberTimes(int number) {
        printSymbolNumberTimes("*", number);
    }

    // Third task
    static void printSymbolNumberTimes(String symbol, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }
}
