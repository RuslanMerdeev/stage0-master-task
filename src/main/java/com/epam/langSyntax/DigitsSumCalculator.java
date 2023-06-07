package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int summed = 0;
        for(; number != 0; number /= 10) {
            summed += number % 10;
        }
        System.out.println(summed);
    }

}
