package com.thoughtworks.marsrover;

import com.thoughtworks.marsrover.command.Command;
import com.thoughtworks.marsrover.direction.Direction;

public abstract class BaseTest {

    protected Plateau plateau = new Plateau(5, 5);
    protected int xCoordinate = 2;
    protected int yCoordinate = 2;
    protected Direction direction;
    protected Rover rover;
    protected Command command;
}
