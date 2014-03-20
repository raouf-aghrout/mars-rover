package com.thoughtworks.marsrover.command;

public enum CommandType {

    R(new SpinRightCommand()),

    L(new SpinLeftCommand()),

    M(new MoveForwardCommand());

    private final Command command;

    CommandType(Command command) {
        this.command = command;
    }
}
