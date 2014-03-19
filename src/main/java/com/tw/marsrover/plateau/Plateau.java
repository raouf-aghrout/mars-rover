package com.tw.marsrover.plateau;

public class Plateau {

    private int maxXCoordinate;
    private int maxYCoordinate;

    public Plateau(int maxXCoordinate, int maxYCoordinate) {
        this.maxXCoordinate = maxXCoordinate;
        this.maxYCoordinate = maxYCoordinate;
    }

    public int getMaxXCoordinate() {
        return maxXCoordinate;
    }

    public void setMaxXCoordinate(int maxXCoordinate) {
        this.maxXCoordinate = maxXCoordinate;
    }

    public int getMaxYCoordinate() {
        return maxYCoordinate;
    }

    public void setMaxYCoordinate(int maxYCoordinate) {
        this.maxYCoordinate = maxYCoordinate;
    }
}
