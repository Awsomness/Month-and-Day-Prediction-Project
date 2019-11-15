package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int dayOfWeek;
        int dayOfMonth;
        int month;
        String month2;
        int year;
        int yearOfCentury;
        int yearZeroBased;
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        System.out.print("Monday's child is fair of face,\n" +
                "Tuesday's child is full of grace,\n" +
                "Wednesday's child is full of woe,\n" +
                "Thursday's child has far to go.\n" +
                "Friday's child is loving and giving,\n" +
                "Saturday's child works hard for a living,\n" +
                "But the child born on the Sabbath Day,\n" +
                "Is fair and wise and good in every way.\n");

        System.out.println("What year were you born?");
        year = keyboard.nextInt();
        System.out.println("What month were you born?(put in a number)");
        month = keyboard.nextInt();
        System.out.println("What month were you born?(Name of month this time)");
        month2 = keyboard.next();
        int answer = month(month, year);
        System.out.println(answer);

    }

    public static int month(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
                return 31;

            case 11:
            case 6:
            case 4:
                return 30;
            case 2:
                if (year % 4 == 0 || year % 400 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }
}
