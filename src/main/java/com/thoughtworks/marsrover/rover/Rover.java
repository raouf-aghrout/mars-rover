package com.thoughtworks.marsrover.rover;

import com.thoughtworks.marsrover.Plateau;
import com.thoughtworks.marsrover.command.Command;
import com.thoughtworks.marsrover.direction.Direction;

import java.util.ArrayList;

public class Rover {

    private final Plateau plateau;
    private int coordinateX;
    private int coordinateY;
    private Direction direction;

    public Rover(Plateau plateau, int coordinateX, int coordinateY, Direction direction) {
        this.plateau = plateau;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction = direction;
    }

    public Plateau getPlateau() {
        return plateau;
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

    public void executeCommandList(ArrayList<Command> commands) {
        for (Command command : commands)
            command.execute(this);
    }

    public void spinRight() {
        direction = getDirection().spinRight();
    }

    public void spinLeft() {
        direction = getDirection().spinLeft();
    }

    public void moveForward() {
        getDirection().moveForward(this);
        validateLocation();
    }

    public void moveBack() {
        getDirection().moveBack(this);
        validateLocation();
    }

    public String broadcastLocation() {
        return coordinateX + " "
                + coordinateY + " "
                + Character.toString(getDirection().getClass().getSimpleName().charAt(0));
    }

    private void validateLocation() {
        if (this.getCoordinateX() > this.getPlateau().getUpperBoundCoordinateX()
                || this.getCoordinateY() > this.getPlateau().getUpperBoundCoordinateY()
                || this.getCoordinateX() < this.getPlateau().getLowerBoundCoordinateX()
                || this.getCoordinateY() < this.getPlateau().getLowerBoundCoordinateY())
            throw new RoverOutOfBoundsException();
    }
}
