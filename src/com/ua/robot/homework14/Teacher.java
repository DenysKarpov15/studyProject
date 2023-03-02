package com.ua.robot.homework14;

public class Teacher extends Human {

    private String firstName;
    private String lastName;
    private String subject;
    private String position;
    private int phoneNumber;

    public Teacher() {
    }

    public Teacher(String firstName, String lastName, String subject, String position, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.position = position;
        this.phoneNumber = phoneNumber;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void printInfo() {
        System.out.println(firstName + " " + lastName + " work at the university!");
        System.out.println("This " + position + " teaches " + subject + ".");
        System.out.println("For more information you can call the number " + phoneNumber);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", subject='" + subject + '\'' +
                ", position='" + position + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
