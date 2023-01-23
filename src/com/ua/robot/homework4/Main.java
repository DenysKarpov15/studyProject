package com.ua.robot.homework4;

public class Main {

    public static void main(String[] args) {
        String txt = "Lesson Four";

        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        int length = txt.length();
        int lastIndex = length - 1;
        System.out.println(txt.charAt(0));  // Just first symbol
        System.out.println(txt.charAt(lastIndex));  // Just last symbol

        System.out.println(txt.substring(0, 1).concat(txt.substring(lastIndex)));  // First and last symbols together
    }
}
