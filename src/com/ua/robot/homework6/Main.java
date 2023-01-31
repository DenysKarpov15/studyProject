package com.ua.robot.homework6;

public class Main {

    public static void main(String[] args) {

        // First task
        System.out.println("Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        // Second task
        System.out.println("Even numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println();

        // Third task
        int number = 7;
        int factorial = 1;
        int iterations = 1;
        while (iterations <= number) {
            factorial *= iterations;
            iterations++;
        }
        System.out.println("Factorial of number " + number + " equals " + factorial);
        System.out.println();

        // Fourth task
        int fibo0 = 0;
        int fibo1 = 1;
        int fibo2;
        System.out.print("Fibonacci numbers: " + fibo0 + " " + fibo1 + " ");
        do {
            fibo2 = fibo0 + fibo1;
            if (fibo2 > 100) {
                break;
            }
            fibo0 = fibo1;
            fibo1 = fibo2;
            System.out.print(fibo2 + " ");
        } while (fibo2 < 100);

    }
}
