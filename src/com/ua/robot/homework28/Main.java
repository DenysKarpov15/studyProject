package com.ua.robot.homework28;

public class Main {

    public static final String FILE_NAME = "new_text.txt";

    public static void main(String[] args) {

        String text = "This is file created using NIO library!";
        FileHandlerNIO handler = new FileHandlerNIO();
        handler.saveToFile(text, FILE_NAME);
        String data = handler.readFromFile(FILE_NAME);
        System.out.println(data);
    }
}
