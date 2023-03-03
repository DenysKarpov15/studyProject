package com.ua.robot.homework15;

public interface Fly {

    String DEFAULT_GREETING = "Nice time to fly";

    default void flyGreeting() {
        System.out.println(DEFAULT_GREETING);
    }

    void flyable();
}
