package com.ua.robot.homework10;

public class Teacher {

    private String name;
    private String surname;
    private String subject;
    private String title;
    private int phoneNumber;

    public Teacher() {
    }

    public Teacher(String name, String surname, String subject, String title, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.subject = subject;
        this.title = title;
        this.phoneNumber = phoneNumber;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void teach() {
        System.out.println("The " + title + " " + name + " " + surname + " is teaching " + subject + "!");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", subject='" + subject + '\'' +
                ", title='" + title + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
