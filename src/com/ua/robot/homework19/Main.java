package com.ua.robot.homework19;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] numbersArray = new int[1000];
        generateRandomNumbers(numbersArray);

        Set<Integer> myHashSet = new HashSet<>();
        fillSet(myHashSet, numbersArray);
        System.out.println(myHashSet);

        Set<Integer> myLinkedHashSet = new LinkedHashSet<>();
        fillSet(myLinkedHashSet, numbersArray);
        System.out.println(myLinkedHashSet);

        Set<Integer> myTreeSet = new TreeSet<>();
        fillSet(myTreeSet, numbersArray);
        System.out.println(myTreeSet);

    }

    public static void generateRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++ ) {
            Random random = new Random();
            array[i] = random.nextInt(1, 51);
        }
    }

    public static void fillSet(Set set, int[] array) {
        for (int element: array) {
            set.add(element);
        }
    }

}
