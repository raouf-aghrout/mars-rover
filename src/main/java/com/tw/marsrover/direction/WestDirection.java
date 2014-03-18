package com.tw.marsrover.direction;

public class WestDirection implements Direction {

    @Override
    public Direction spinRight() {
        return new NorthDirection();
    }

    @Override
    public Direction spinLeft() {
        return new SouthDirection();
    }
}
