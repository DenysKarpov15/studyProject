package com.ua.robot.homework28;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandler {

    public void saveToFile(String text, String filename) {
        try {
            Path filePath = Paths.get(filename);
            Files.writeString(filePath, text, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Error happens: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public String readFromFile(String filename) {
        try {
            Path filePath = Paths.get(filename);
            return Files.readString(filePath, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Сталась помилка при зчитуванні даних з файлу " + filename);
            e.printStackTrace();
            return null;
        }
    }
}
