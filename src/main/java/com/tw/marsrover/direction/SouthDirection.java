package com.tw.marsrover.direction;

public class SouthDirection implements Direction {

    @Override
    public Direction spinRight() {
        return new WestDirection();
    }

    @Override
    public Direction spinLeft() {
        return new EastDirection();
    }
}
