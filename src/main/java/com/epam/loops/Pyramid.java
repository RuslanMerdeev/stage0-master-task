package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = cathetusLength; j > 0; j--) {
                add(i, j, row, " ");
            }
            for (int j = 2; j <= cathetusLength; j++) {
                add(i, j, row, "");
            }
            System.out.println(row);
        }
    }

    private static void add(int i, int j, StringBuilder row, String stub) {
        row.append((i >= j) ? j : stub);
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
