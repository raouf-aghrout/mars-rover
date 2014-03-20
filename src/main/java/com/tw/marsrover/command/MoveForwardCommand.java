package com.tw.marsrover.command;

import com.tw.marsrover.Rover;

public class MoveForwardCommand implements Command {

    @Override
    public void execute(Rover rover) {
        rover.moveForward();
    }
}
