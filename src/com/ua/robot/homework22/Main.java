package com.ua.robot.homework22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Barsunenko", 10.5));
        students.add(new Student("Avramenko", 7.1));
        students.add(new Student("Vchitilenko", 11.9));
        students.add(new Student("Stetsenko", 10.5));
        students.add(new Student("Ivanenko", 8.1));

        printStudents(students);
        System.out.println();

        Comparator<Student> lastNameComparator = (s1, s2) -> s1.getLastName().compareTo(s2.getLastName());
        Collections.sort(students, lastNameComparator);
        printStudents(students);
        System.out.println();

        Comparator<Student> averageGradeComparator = Comparator.comparing(Student::getAverageGrade).reversed();
        Collections.sort(students, averageGradeComparator);
        printStudents(students);

    }

    public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }


}
