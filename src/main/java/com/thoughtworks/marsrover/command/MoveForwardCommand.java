package com.thoughtworks.marsrover.command;

import com.thoughtworks.marsrover.rover.Rover;

public class MoveForwardCommand implements Command {

    @Override
    public void execute(Rover rover) {
        rover.moveForward();
    }
}
