package com.ua.robot.homework10;

public class Main {

    public static void main(String[] args) {

        Student switcher1 = new Student();
        Student switcher2 = new Student("Petro", "Maksymenko");
        Student switcher3 = new Student("Anna", "Stepanenko", 23);
        Student switcher4 = new Student("Sergiy", "Martynenko", 21, "math");
        Student switcher5 = new Student("Ivan", "Petrenko", 19, "informatics", 10.5);
        System.out.println(switcher5);
        switcher5.study();

        Teacher professor = new Teacher("Natalia", "Vchitilenko", "mathematics", "professor",3559781);
        System.out.println(professor);
        professor.teach();
        System.out.println();

        NumbersArrayService numbersArrayService = new NumbersArrayService();
        int[] array1 = numbersArrayService.createRandomArray(10);
        int[] array2 = numbersArrayService.createRandomArray(17, -100, 241);
        numbersArrayService.printArray(array1);
        numbersArrayService.printArray(array2);

        array1 = numbersArrayService.sortArray(array1);
        array2 = numbersArrayService.sortArray(array2, true);
        numbersArrayService.printArray(array1);
        numbersArrayService.printArray(array2);
    }
}
