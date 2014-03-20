package com.tw.marsrover.command;

import com.tw.marsrover.Rover;

public interface Command {

    public abstract void execute(Rover rover);
}
