package com.thoughtworks.marsrover.command;

import com.thoughtworks.marsrover.rover.Rover;

public interface Command {

    public abstract void execute(Rover rover);
}
