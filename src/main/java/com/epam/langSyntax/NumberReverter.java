package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int reversed = 0;
        for(; number != 0; number /= 10) {
            reversed = reversed * 10 + number % 10;
        }
        System.out.println(reversed);
    }

}
