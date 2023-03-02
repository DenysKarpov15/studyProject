package com.ua.robot.homework14;

public class Main {

    public static void main(String[] args) {

        Human student1 = new Student("Ivan", "Petrenko", "male", 19, "informatics", 10.5);
        Human student2 = new Student("Alina", "Stepanenko", "female", 20, "mathematics", 9.7);
        Human teacher = new Teacher("Natalia", "Vchitilenko", "mathematics", "professor",3559781);

        student1.printInfo();
        student2.printInfo();
        teacher.printInfo();
    }
}
