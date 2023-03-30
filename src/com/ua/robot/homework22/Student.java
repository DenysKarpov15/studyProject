package com.ua.robot.homework22;

public class Student {

    private String lastName;
    private double averageGrade;

    public Student() {
    }

    public Student(String lastName, double averageGrade) {
        this.lastName = lastName;
        this.averageGrade = averageGrade;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
