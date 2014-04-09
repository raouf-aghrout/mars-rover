package com.thoughtworks.marsrover.command;

import com.thoughtworks.marsrover.rover.Rover;

public class MoveBackCommand implements Command {

    @Override
    public void execute(Rover rover) {
        rover.moveBack();
    }
}
