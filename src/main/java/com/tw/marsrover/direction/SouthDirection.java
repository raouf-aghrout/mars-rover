package com.tw.marsrover.direction;

import com.tw.marsrover.Rover;

public class SouthDirection implements Direction {

    @Override
    public Direction spinRight() {
        return new WestDirection();
    }

    @Override
    public Direction spinLeft() {
        return new EastDirection();
    }

    @Override
    public void moveForward(Rover rover) {

    }
}
