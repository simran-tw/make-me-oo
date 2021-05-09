package org.oop;

public class DistanceAndDirectionCalculator {
    public static double distance(Line line) {
        return line.getLength();
    }

    public static double direction(Line line) {
        return line.getDirection();
    }
}
