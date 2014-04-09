package com.thoughtworks.marsrover.command;

import com.thoughtworks.marsrover.rover.Rover;

public class SpinLeftCommand implements Command {

    @Override
    public void execute(Rover rover) {
        rover.spinLeft();
    }
}
