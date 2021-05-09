package org.oop;

public class DistanceAndDirectionCalculator {
    public static double distance(Point from, Point to) {
        return new Line(from,to).getLength();
    }

    public static double direction(Point from, Point to) {
        return new Line(from,to).getDirection();
    }
}
