package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        String isTriangle = "it's not a triangle";
        if (isPositiveSides(firstSide, secondSide, thirdSide) &&
                isContinuous(firstSide, secondSide, thirdSide) &&
                isContinuous(secondSide, thirdSide, firstSide) &&
                isContinuous(thirdSide, firstSide, secondSide)) {
            isTriangle = "this is a valid triangle";
        }
        System.out.println(isTriangle);
    }

    private boolean isPositiveSides(double firstSide, double secondSide, double thirdSide) {
        return firstSide > 0 && secondSide > 0 && thirdSide > 0;
    }

    private boolean isContinuous(double firstSide, double secondSide, double thirdSide) {
        return firstSide < (secondSide + thirdSide);
    }
}
