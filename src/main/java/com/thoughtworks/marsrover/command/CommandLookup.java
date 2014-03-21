package com.thoughtworks.marsrover.command;

public enum CommandLookup {

    R(new SpinRightCommand()),

    L(new SpinLeftCommand()),

    M(new MoveForwardCommand());

    private final Command command;

    CommandLookup(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }
}
