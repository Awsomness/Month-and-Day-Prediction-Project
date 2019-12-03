package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int dayOfWeek;
        int dayOfMonth;
        int month;
        int year;
        int yearOfCentury;
        int yearZeroBased;
        int GregorianCalender;
        String answer4;

        Scanner keyboard;
        keyboard = new Scanner(System.in);
        do {

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

            System.out.println("What is the day that you were born?");
            dayOfMonth = keyboard.nextInt();
            int answer = month(month, year);
            System.out.println("There are " + answer + " days in the month");


            int answer2 = GregorianCalender(month, year, dayOfMonth);
            System.out.println(answer2);

            String answer3 = monthPoem(answer2);
            System.out.println(answer3);
            System.out.println("Do you want to continue?");
            keyboard.nextLine();
            answer4 = keyboard.nextLine().toLowerCase();



        } while(answer4.equals("yes"));
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
                if ((year % 100 == 0 && year % 400 == 0) || (!(year % 100 ==0) && year % 4 ==0) ) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }
    public static int GregorianCalender(int month, int year,int dayOfMonth){

        if (month == 1 || month == 2) {
            month = (month + 12);
            year--;

        }
        int yearZero;
        yearZero = (year / 100);
        int GregorianCalender2;
        GregorianCalender2 = 13 * (month + 1);
        int yearOfCentury;
        yearOfCentury = (year % 100);
        int dayOfWeek;
        dayOfWeek = ((dayOfMonth + ((GregorianCalender2)/ 5) + yearOfCentury + (yearOfCentury / 4) + ((yearZero) / 4) + (5 * (yearZero))) % 7);
        return dayOfWeek;

    }

    public static String monthPoem(int dayOfWeek) {

        switch (dayOfWeek) {
            case 1:
            return "Your birthday was on Sunday \n" + "You are fair and wise and good in every way.";

            case 2:
            return "Your birthday was on Monday \n" + "You have a fair face";

            case 4:
            return "Your birthday was on Wednesday \n" + "You are full of woe";

            case 5:
            return "Your birthday was on Thursday \n" + "You have far to go";

            case 6:
            return "Your birthday was on Friday \n" + "You are loving and giving";

            case 0:
            return "Your birthday was on Saturday \n" + "You work hard for a living";

            default:
            return "Your birthday was on Tuesday \n" + "You are full of grace";
        }

        }
    }

