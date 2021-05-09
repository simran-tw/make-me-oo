package org.oop;

public class Line {
    private Point from;
    private Point to;

    public Line(Point from, Point to) {

        this.from = from;
        this.to = to;
    }
    double getLength(){
        double xDistance = to.getX() - from.getX();
        double yDistance = to.getY() - from.getY();
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }
    double getDirection(){
        double xDistance = to.getX() - from.getX();
        double yDistance = to.getY() - from.getY();
        return Math.atan2(yDistance, xDistance);
    }

}
