package com.ua.robot.homework15;

public interface Drive {

    String DEFAULT_GREETING = "Hello world!";
    default void greeting() {
        System.out.println(DEFAULT_GREETING);
    }

    void profession();

    default void drive() {
        System.out.println("I can drive something");
    }
}
