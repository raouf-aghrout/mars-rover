package com.thoughtworks.marsrover;

import com.thoughtworks.marsrover.command.Command;
import com.thoughtworks.marsrover.rover.Rover;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class MarsRover {

    public static void main(String[] args) throws IOException {

        ArrayList<String> inputFileAsList = InputUtil.parseInputFromFile(MarsRover.class.getResourceAsStream("/input.txt"));
        // The first instruction is separated out, as this is for creating the Plateau, which is global for all Rovers
        List<String> roverInput = inputFileAsList.subList(1, inputFileAsList.size());

        System.out.println("Input:" + "\n");
        for (String line : inputFileAsList)
            System.out.println(line);

        System.out.println("\n" + "Output:" + "\n");
        Plateau plateau = InputUtil.parsePlateauInput(inputFileAsList.get(0));
        // Subsequent pairs of instructions are used to create a Rover and a set of Commands
        // We then run the set of Commands on that Rover and repeat this for the next pair of instructions
        for (int i = 0; i < roverInput.size(); i += 2) {
            Rover rover = InputUtil.parsePositionInput(roverInput.get(i), plateau);
            ArrayList<Command> commands = InputUtil.parseCommandInput(roverInput.get(i + 1));
            rover.executeCommandList(commands);
            System.out.println(rover.broadcastLocation());
        }
    }
}
