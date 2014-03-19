package com.tw.marsrover.rover;

import com.tw.marsrover.direction.Direction;
import com.tw.marsrover.plateau.Plateau;

public class Rover {

    private int coordinateX;
    private int coordinateY;
    private Direction direction;
    private Plateau plateau;

    public Rover(int coordinateX, int coordinateY, Direction direction, Plateau plateau) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction = direction;
        this.plateau = plateau;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
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
}
