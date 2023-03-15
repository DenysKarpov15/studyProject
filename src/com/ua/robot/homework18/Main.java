package com.ua.robot.homework18;

import com.ua.robot.homework14.Human;
import com.ua.robot.homework14.Teacher;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> tenElements = new LinkedList<>();
        generateRandomList(tenElements, 10);
        System.out.println(tenElements);

        List<Integer> twoMillionElements = new ArrayList<>();
        generateRandomList(twoMillionElements, 2000000);  //This list don't print because is very huge

        List<Student> studentList = new LinkedList<>();
        Student student1 = new Student("Ivan", "Petrenko", "male", 19, "informatics", 10.5);
        Student student2 = new Student("Alina", "Stepanenko", "female", 20, "mathematics", 9.7);
        Student student3 = new Student("Natalia", "Vchitilenko", "female", 21, "geography", 10.7);

        studentList.add(student3);
        studentList.add(0, student1);
        studentList.add(1, student2);

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
        System.out.println();

        for (Student student: studentList) {
            student.printInfo();
        }

        MyArrayList<Integer> myArray = new MyArrayList<>();
        System.out.println(myArray);
        myArray.add(7);
        System.out.println(myArray);
        myArray.add(10);
        myArray.add(14);
        myArray.add(31);
        System.out.println(myArray);
        System.out.println(myArray.size());
        System.out.println(myArray.get(2));
        myArray.remove(1);
        myArray.remove(1);
        System.out.println(myArray);
        System.out.println(myArray.size());
    }

    public static void generateRandomList(List list, int length) {
        for (int i = 0; i < length; i++ ) {
            Random random = new Random();
            list.add(random.nextInt(0, length + 1));
        }
    }
}
