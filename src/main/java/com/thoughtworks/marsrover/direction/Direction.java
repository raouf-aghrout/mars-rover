package com.thoughtworks.marsrover.direction;

import com.thoughtworks.marsrover.Rover;

public interface Direction {

    public abstract Direction spinRight();

    public abstract Direction spinLeft();

    public abstract void moveForward(Rover rover);
}