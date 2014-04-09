package com.thoughtworks.marsrover.command;

import com.thoughtworks.marsrover.rover.Rover;

public class SpinRightCommand implements Command {

    @Override
    public void execute(Rover rover) {
        rover.spinRight();
    }
}
