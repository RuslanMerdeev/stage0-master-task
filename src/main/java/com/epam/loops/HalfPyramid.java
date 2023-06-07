package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = cathetusLength; j > 0; j--) {
                add(i, j, row);
            }
            System.out.println(row);
        }
    }

    private static void add(int i, int j, StringBuilder row) {
        row.append((i >= j) ? "*" : " ");
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
