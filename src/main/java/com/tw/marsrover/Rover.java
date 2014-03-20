package com.tw.marsrover;

import com.tw.marsrover.direction.Direction;

public class Rover {

    private Plateau plateau;
    private int xCoordinate;
    private int yCoordinate;
    private Direction direction;

    public Rover(Plateau plateau, int xCoordinate, int yCoordinate, Direction direction) {
        this.plateau = plateau;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }

    public Plateau getPlateau() {
        return plateau;
    }

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

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
