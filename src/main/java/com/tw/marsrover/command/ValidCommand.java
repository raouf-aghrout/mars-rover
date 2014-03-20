package com.tw.marsrover.command;

public enum ValidCommand {

    R (new SpinRightCommand()),

    L (new SpinLeftCommand()),

    M (new MoveForwardCommand());

    private final Command command;

    ValidCommand(Command command) {
        this.command = command;
    }
}
