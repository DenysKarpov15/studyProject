package com.ua.robot.homework10;

import java.util.Random;

public class NumbersArrayService {

    public int[] createRandomArray(int length) {
        return createRandomArray(length, 0, 100);
    }

    public int[] createRandomArray(int length, int minValue, int maxValue) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValue - minValue) + minValue;
        }
        return array;
    }

    public int[] sortArray(int[] array) {
        return sortArray(array, false);
    }

    public int[] sortArray(int[] array, boolean descendingSort) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (descendingSort) {
                    if (array[i] < array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                } else {
                    if (array[i] > array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int el : array) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
