package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        if (numberTableToPrint < 0) return;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%s x %s = %s%n", i, numberTableToPrint, i*numberTableToPrint);
        }
    }

}
