package com.ua.robot.homework27;

public class Main {

    public static final String FILE_NAME = "text.txt";

    public static void main(String[] args) {

        String text = "This is text string for file creation!";
        FileHandler.saveToFile(text, FILE_NAME);
        String data = FileHandler.readFromFile(FILE_NAME);
        System.out.println(data);
    }
}
