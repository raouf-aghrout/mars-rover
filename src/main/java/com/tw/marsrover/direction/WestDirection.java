package com.tw.marsrover.direction;

import com.tw.marsrover.Rover;

public class WestDirection implements Direction {

    @Override
    public Direction spinRight() {
        return new NorthDirection();
    }

    @Override
    public Direction spinLeft() {
        return new SouthDirection();
    }

    @Override
    public void moveForward(Rover rover) {

    }
}
