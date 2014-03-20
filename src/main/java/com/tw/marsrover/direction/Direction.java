package com.tw.marsrover.direction;

import com.tw.marsrover.Rover;

public interface Direction {

    public abstract Direction spinRight();

    public abstract Direction spinLeft();

    public abstract void moveForward(Rover rover);
}
