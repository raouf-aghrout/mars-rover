package com.tw.marsrover.direction;

import com.tw.marsrover.Rover;

public class EastDirection implements Direction {

    @Override
    public Direction spinRight() {
        return new SouthDirection();
    }

    @Override
    public Direction spinLeft() {
        return new NorthDirection();
    }

    @Override
    public void moveForward(Rover rover) {
        rover.setCoordinateX(rover.getCoordinateX() + 1);
    }
}
