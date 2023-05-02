package com.ua.robot.homework33;

import java.util.Random;

public class NumberGeneratorThread extends Thread {

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                int num = generateNumber();
                System.out.println(num);
                if (num == 5) {
                    interrupt();
                    System.out.println("Number is 5 and thread was interrupted!");
                    System.out.println("This is the end!!!");
                }
            }
        } catch (Exception e) {
            System.out.println("Error happens: " + e.getMessage());
        }
    }

    private int generateNumber() {
        // Генеруємо випадкове число від 1 до 10
        Random rand = new Random();
        return rand.nextInt(10) + 1;
    }
}
