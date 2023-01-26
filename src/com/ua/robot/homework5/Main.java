package com.ua.robot.homework5;

public class Main {

    public static void main(String[] args) {

        int a = 4;
        int b = 7;

        // Calculation of a larger number
        if (a > b) {
            System.out.println(a + " is larger " + b);
        } else if (a == b) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println(b + " is larger " + a);
        }

        // Calculation of a smaller number
        if (a < b) {
            System.out.println(a + " is smaller " + b);
        } else if (a == b) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println(b + " is smaller " + a);
        }

        // Check for even
        if (a % 2 == 0) {
            System.out.println(a + " is even");
        } else {
            System.out.println(a + " is odd");
        }

    }
}
