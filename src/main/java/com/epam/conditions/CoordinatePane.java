package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        String result = "zero";
        if (x != 0 && y != 0) {
           if (x > 0) {
               if (y > 0) {
                   result = "first";
               } else {
                   result = "fourth";
               }
           } else {
               if (y > 0) {
                   result = "second";
               } else {
                   result = "third";
               }
           }
        }
        System.out.println(result);
    }
}

