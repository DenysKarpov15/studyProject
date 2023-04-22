package com.ua.robot.homework27;

import java.io.*;

public class FileHandler {

    public static void saveToFile(String text, String fileName) {
        try (OutputStream os = new FileOutputStream(fileName);
             OutputStreamWriter osw = new OutputStreamWriter(os)) {
            osw.write(text);
        } catch (IOException e) {
            System.out.println("Error happens: " + e.getMessage());
        }
    }

    public static String readFromFile(String fileName) {
        String dataString = "";
        try (InputStream is = new FileInputStream(fileName)) {
            byte[] data = is.readAllBytes();
            dataString = new String(data);
        } catch (IOException e) {
            System.out.println("Error happens: " + e.getMessage());
        }
        return dataString;
    }
}
