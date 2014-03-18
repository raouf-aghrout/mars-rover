package com.tw.marsrover.direction;

public class EastDirection implements Direction {

    @Override
    public Direction spinRight() {
        return new SouthDirection();
    }

    @Override
    public Direction spinLeft() {
        return new NorthDirection();
    }
}
