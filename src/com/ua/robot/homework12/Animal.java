package com.ua.robot.homework12;

public class Animal {

    private static int count;
    private String species;
    private String breed;
    private int age;

    static {
        System.out.println("This is static initialization block");
    }

    {
        System.out.println();
    }

    {
        count++;
        System.out.println("Object number " + count);
    }

    {
        System.out.println("Final and non static initialization block");
    }

    public Animal() {
        System.out.println("Default constructor");
    }

    public Animal(String species, String breed, int age) {
        this.species = species;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
