package com.tw.marsrover.plateau;

public class Plateau {

    private int upperBoundCoordinateX;
    private int upperBoundCoordinateY;
    private int lowerBoundCoordinateX;
    private int lowerBoundCoordinateY;

    public Plateau(int upperBoundCoordinateX, int upperBoundCoordinateY) {
        this.upperBoundCoordinateX = upperBoundCoordinateX;
        this.upperBoundCoordinateY = upperBoundCoordinateY;
        this.lowerBoundCoordinateX = 0;
        this.lowerBoundCoordinateY = 0;
    }

    public int getUpperBoundCoordinateX() {
        return upperBoundCoordinateX;
    }

    public void setUpperBoundCoordinateX(int upperBoundCoordinateX) {
        this.upperBoundCoordinateX = upperBoundCoordinateX;
    }

    public int getUpperBoundCoordinateY() {
        return upperBoundCoordinateY;
    }

    public void setUpperBoundCoordinateY(int upperBoundCoordinateY) {
        this.upperBoundCoordinateY = upperBoundCoordinateY;
    }

    public int getLowerBoundCoordinateX() {
        return lowerBoundCoordinateX;
    }

    public void setLowerBoundCoordinateX(int lowerBoundCoordinateX) {
        this.lowerBoundCoordinateX = lowerBoundCoordinateX;
    }

    public int getLowerBoundCoordinateY() {
        return lowerBoundCoordinateY;
    }

    public void setLowerBoundCoordinateY(int lowerBoundCoordinateY) {
        this.lowerBoundCoordinateY = lowerBoundCoordinateY;
    }
}
