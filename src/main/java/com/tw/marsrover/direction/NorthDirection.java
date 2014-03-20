package com.tw.marsrover.direction;

import com.tw.marsrover.Rover;

public class NorthDirection implements Direction {

    @Override
    public Direction spinRight() {
        return new EastDirection();
    }

    @Override
    public Direction spinLeft() {
        return new WestDirection();
    }

    @Override
    public void moveForward(Rover rover) {

    }
}
