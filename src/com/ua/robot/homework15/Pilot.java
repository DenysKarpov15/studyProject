package com.ua.robot.homework15;

public class Pilot extends Human implements Fly {

    private double flightHours;

    public Pilot() {
        super();
    }

    public Pilot(String firstName, String lastName, int age, double flightHours) {
        super(firstName, lastName, age);
        this.flightHours = flightHours;
    }

    public double getFlightHours() {
        return flightHours;
    }

    public void setFlightHours(double flightHours) {
        this.flightHours = flightHours;
    }

    @Override
    public void profession() {
        Fly.super.flyGreeting();
        System.out.println(getFirstName() + " " + getLastName() + " is " + getAge() + " years old pilot that has fly for " + flightHours + " hours.");
    }

    @Override
    public void drive() {
        System.out.println("I can fly a plane!");
    }

    @Override
    public void flyable() {
        System.out.println("Let's fly!");
    }
}
