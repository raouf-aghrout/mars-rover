package com.tw.marsrover;

public class Rover {

    private int xCoordinate;
    private int yCoordinate;
    private CompassBearing compassBearing;

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public CompassBearing getCompassBearing() {
        return compassBearing;
    }

    public void setCompassBearing(CompassBearing compassBearing) {
        this.compassBearing = compassBearing;
    }
}
