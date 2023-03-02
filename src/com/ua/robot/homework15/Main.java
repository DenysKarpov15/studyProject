package com.ua.robot.homework15;

public class Main {

    public static void main(String[] args) {

        Drive human = new Human();
        human.greeting();
        human.profession();
        human.drive();
        System.out.println();

        Drive driver = new Driver("Ivan", "Petrenko", 34, "A");
        driver.profession();
        driver.drive();
        System.out.println();

        Fly pilot = new Pilot("Mykola", "Martynenko", 27, 150);
        pilot.flyable();

        Pilot pilot2 = (Pilot) pilot;
        pilot2.profession();
        pilot2.drive();
    }
}
