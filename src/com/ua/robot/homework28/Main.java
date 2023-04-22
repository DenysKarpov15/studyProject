package com.ua.robot.homework28;

import com.ua.robot.homework27.FileHandler;

public class Main {

    public static final String FILE_NAME = "new_text.txt";

    public static void main(String[] args) {

        String text = "This is file created using NIO library!";
        FileHandler.saveToFile(text, FILE_NAME);
        String data = FileHandler.readFromFile(FILE_NAME);
        System.out.println(data);
    }
}
