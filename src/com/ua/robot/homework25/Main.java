package com.ua.robot.homework25;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");

        while(true) {
            try {
                String userInput = input.nextLine();
                int number = Integer.parseInt(userInput);
                System.out.println("Thank you for correct input of number " + number);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: input is not number. Please enter a number:");
            }
        }

        System.out.println("Program done!");
    }
}
