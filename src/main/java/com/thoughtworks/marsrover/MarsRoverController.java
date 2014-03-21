package com.thoughtworks.marsrover;

import com.thoughtworks.marsrover.command.Command;
import com.thoughtworks.marsrover.util.InputUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MarsRoverController {

    public static void main(String[] args) throws IOException {

        ArrayList<String> inputFileAsList = InputUtil.parseInputFromFile(MarsRoverController.class.getResourceAsStream("/input.txt"));
        List<String> roverInput = inputFileAsList.subList(1, inputFileAsList.size());

        System.out.println("Input:" + "\n");
        for (String line : inputFileAsList) System.out.println(line);

        System.out.println("\n" + "Output:" + "\n");
        Plateau plateau = new InputUtil().parsePlateauInput(inputFileAsList.get(0));

        for (int i = 0; i < roverInput.size(); i += 2) {
            Rover rover = InputUtil.parsePositionInput(roverInput.get(i), plateau);
            ArrayList<Command> commands = InputUtil.parseCommandInput(roverInput.get(i + 1));
            rover.executeCommandList(commands);
            System.out.println(rover.broadcastLocation());
        }
    }
}
