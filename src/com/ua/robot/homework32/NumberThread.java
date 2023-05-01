package com.ua.robot.homework32;

public class NumberThread implements Runnable {
    private final String NAME;

    public NumberThread(String NAME) {
        this.NAME = NAME;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(NAME + ": " + i);
        }
    }
}
