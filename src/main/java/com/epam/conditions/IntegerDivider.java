package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        String result = "cannot be divided completely";
        if (divider == 0) {
            result = "division by zero";
        } else {
            int current = dividend / divider;
            if (current *  divider == dividend) {
                result = "can be divided completely";
            }
        }
        System.out.println(result);
    }

}
