package com.epam.conditions;

import java.util.List;

public class DaysInMonth {

    private final List<Integer> DAYS_IN_MONTH = List.of(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);

    public void printDays(int year, int month) {
        if (month >= 1 && month <= 12) {
            int day = DAYS_IN_MONTH.get(month-1);
            if (isLeap(year) && (!isCentury(year) || isMillennium(year))) {
                day++;
            }
            System.out.println(day);
        } else {
            System.out.println("invalid date");
        }
    }

    private boolean isLeap(int year) {
        return year % 4 == 0;
    }

    private boolean isCentury(int year) {
        return year % 100 == 0;
    }

    private boolean isMillennium(int year) {
        return year % 1000 == 0;
    }
}
