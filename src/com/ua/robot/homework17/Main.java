package com.ua.robot.homework17;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDayByNumber(1));
        System.out.println(getDayByNumber(5));
        System.out.println(getDayByNumber(7));

    }

    public static DaysOfWeek getDayByNumber(int dayNumber) {
        DaysOfWeek day = DaysOfWeek.MONDAY;
        for (DaysOfWeek value : DaysOfWeek.values()) {
            if (dayNumber == value.getNumberOfWeek()) {
                day = value;
            }
        }
        return day;
    }
}
