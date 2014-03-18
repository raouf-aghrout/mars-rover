package com.tw.marsrover.direction;

public class NorthDirection implements Direction {

    @Override
    public Direction spinRight() {
        return new EastDirection();
    }

    @Override
    public Direction spinLeft() {
        return new WestDirection();
    }
}
