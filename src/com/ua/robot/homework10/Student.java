package com.ua.robot.homework10;

public class Student {

    private String name;
    private String surname;
    private int age;
    private  String faculty;
    private double averageGrade;

    public Student() {
        System.out.println("Default constructor");
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Student(String name, String surname, int age) {
        this(name, surname);
        this.age = age;
    }

    public Student(String name, String surname, int age, String faculty) {
        this(name, surname, age);
        this.faculty = faculty;
    }

    public Student(String name, String surname, int age, String faculty, double averageGrade) {
        this(name, surname, age, faculty);
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public void study() {
        System.out.println(name + " " + surname + " is studying!");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", faculty='" + faculty + '\'' +
                ", averageGrade='" + averageGrade + '\'' +
                '}';
    }
}
