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
    public static int GregorianCalender(int month, int year,){

    }

    public static String monthPoem(int dayOfWeek) {

        if (dayOfWeek == 1) {
            return "Your birthday was on Monday \n" + "You have a fair face";
        } else if (dayOfWeek == 2) {
            return "Your birthday was on Tuesday \n" + "You are full of grace";
        } else if (dayOfWeek == 3) {
            return "Your birthday was on Wendsday \n" + "You are full of woe";
        } else if (dayOfWeek == 4) {
            return "Your birthday was on Thursday \n" + "You have far to go";
        } else if (dayOfWeek == 5) {
            return "Your birthday was on Friday \n" + "You are loving and giving";
        } else if (dayOfWeek == 6) {
            return "Your birthday was on Saturday \n" + "You work hard for a living";
        } else {
            return "Your birthday was on Sunday \n" + "You are fair and wise and good in every way.";
        }
    }
}
