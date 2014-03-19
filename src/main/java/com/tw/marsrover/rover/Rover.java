package com.tw.marsrover.rover;

import com.tw.marsrover.direction.Direction;
import com.tw.marsrover.plateau.Plateau;

public class Rover {

    private int xCoordinate;
    private int yCoordinate;
    private Direction direction;
    private Plateau plateau;

    public Rover(int xCoordinate, int yCoordinate, Direction direction, Plateau plateau) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
        this.plateau = plateau;
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

    public Plateau getPlateau() {
        return plateau;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }
}
