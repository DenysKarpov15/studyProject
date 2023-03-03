package com.ua.robot.homework15;

public class Driver extends Human {

    private String category;

    public Driver() {
        super();
    }

    public Driver(String firstName, String lastName, int age, String category) {
        super(firstName, lastName, age);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public void profession() {
        greeting();
        System.out.println(getFirstName() + " " + getLastName() + " is " + getAge() + " years old driver with category " + category + ".");
    }

    @Override
    public void drive() {
        System.out.println(getFirstName() + " " + getLastName() + " drive a car.");
    }
}
