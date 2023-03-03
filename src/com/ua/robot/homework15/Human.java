package com.ua.robot.homework15;

public class Human implements Drive {

    private String firstName;
    private String lastName;
    private int age;

    public Human() {
        System.out.println("Default constructor!");
    }

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void profession() {
        System.out.println("I am a human, and I can study some profession");
    }


}
