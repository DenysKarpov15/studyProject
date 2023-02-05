package com.ua.robot.homework8;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int arrayLength = 10;
        int[] array = new int[arrayLength];
        fillArrayWithRandomNumbers(array, 1, 30);
        printArray(array);
        System.out.println("Min number of array is " + minArrayNumber(array));
        System.out.println("Max number of array is " + maxArrayNumber(array));
        System.out.println("Average array value is " + averageArrayValue(array));
        System.out.println("Sum of array elements is " + sumOfArrayElements(array));
    }

    static void fillArrayWithRandomNumbers(int[] array, int maxValue) {  // Method overloading with 0 minValue at default
        fillArrayWithRandomNumbers(array, 0, maxValue);
    }

    static void fillArrayWithRandomNumbers(int[] array, int minValue, int maxValue) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValue - minValue) + minValue;
        }
    }

    static void printArray(int[] array) {
        for (int el : array) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    static int minArrayNumber(int[] array) {
        int minNumber = array[0];
        for (int el : array) {
            if (el < minNumber) {
                minNumber = el;
            }
        }
        return minNumber;
    }

    static int maxArrayNumber(int[] array) {
        int maxNumber = array[0];
        for (int el: array) {
            if (el > maxNumber) {
                maxNumber = el;
            }
        }
        return maxNumber;
    }

    static double averageArrayValue(int[] array) {
        int sum = sumOfArrayElements(array);
        return sum / Double.valueOf(array.length);
    }

    static int sumOfArrayElements(int[] array) {
        int sum = 0;
        for (int el : array) {
            sum += el;
        }
        return sum;
    }
}
