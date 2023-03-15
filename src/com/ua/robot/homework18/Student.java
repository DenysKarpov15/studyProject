package com.ua.robot.homework18;

public class Student {

    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private  String faculty;
    private double averageGrade;

    public Student() {
    }

    public Student(String firstName, String lastName, String gender, int age, String faculty, double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.faculty = faculty;
        this.averageGrade = averageGrade;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public void printInfo() {
        System.out.println(firstName + " " + lastName + " is " + age + " year old student studying at the faculty of " + faculty + ".");
        String appeal;
        if (gender.equals("female")) {
            appeal = "Her";
        } else {
            appeal = "His";
        }
        System.out.println(appeal + " average grade is " + averageGrade + " points.");
        System.out.println();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", faculty='" + faculty + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
