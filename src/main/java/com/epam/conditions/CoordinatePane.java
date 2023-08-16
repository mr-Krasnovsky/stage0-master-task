package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        String quadrant = (x == 0 && y == 0) ? "zero" :
                (x > 0 && y > 0) ? "first" :
                        (x < 0 && y > 0) ? "second" :
                                (x < 0 && y < 0) ? "third" :
                                        (x > 0 && y < 0) ? "fourth" : "unknown";
        System.out.println(quadrant);
    }

}

