package com.ua.robot.homework32;

public class Main {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new NumberThread("First thread"));
        Thread thread2 = new Thread(new NumberThread("Second thread"));
        thread1.start();
        thread2.start();
    }
}
