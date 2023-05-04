package com.ua.robot.homework34;

import java.util.Random;
import java.util.concurrent.*;
import static java.util.concurrent.Executors.newFixedThreadPool;

public class Main {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = newFixedThreadPool(10);
        Callable<Integer> task = () -> {
            Random rand = new Random();
            return rand.nextInt(50) + 1;
        };
        for (int i = 0; i < 10; i++) {
            Future<Integer> future = executor.submit(task);
            int randomNumber = future.get();
            System.out.println("Random number generated by thread " + (i + 1) + " is " + randomNumber);
        }
        executor.shutdown();

    }
}
