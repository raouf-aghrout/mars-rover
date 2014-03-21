package com.thoughtworks.marsrover;

import com.thoughtworks.marsrover.command.Command;
import com.thoughtworks.marsrover.command.MoveForwardCommand;
import com.thoughtworks.marsrover.command.SpinLeftCommand;
import com.thoughtworks.marsrover.command.SpinRightCommand;
import com.thoughtworks.marsrover.direction.EastDirection;
import com.thoughtworks.marsrover.direction.NorthDirection;
import com.thoughtworks.marsrover.direction.WestDirection;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class RoverTest extends BaseTest {

    @Before
    public void setUp() throws Exception {
        direction = new NorthDirection();
        rover = new Rover(plateau, xCoordinate, yCoordinate, direction);
    }

    @Test
    public void whenRequestedRoverCanSpinRight() throws Exception {
        rover.spinRight();
        assertEquals(EastDirection.class, rover.getDirection().getClass());
    }

    @Test
    public void whenRequestedRoverCanSpinLeft() throws Exception {
        rover.spinLeft();
        assertEquals(WestDirection.class, rover.getDirection().getClass());
    }

    @Test
    public void whenRequestedRoverCanMoveForward() throws Exception {
        rover.moveForward();
        assertEquals(++yCoordinate, rover.getCoordinateY());
    }

    @Test
    public void whenRequestedRoverCanPrintCurrentPosition() throws Exception {
        assertEquals(xCoordinate + " "
                + yCoordinate + " "
                + direction.getClass().getSimpleName().charAt(0), rover.broadcastLocation());
    }

    @Test
    public void whenRequestedRoverCanExecuteCommandAsAList() throws Exception {
        ArrayList<Command> commandArrayList = new ArrayList<Command>();
        commandArrayList.add(new MoveForwardCommand());
        commandArrayList.add(new MoveForwardCommand());
        commandArrayList.add(new SpinLeftCommand());
        commandArrayList.add(new MoveForwardCommand());
        commandArrayList.add(new SpinRightCommand());
        rover.executeCommandList(commandArrayList);

        assertEquals(1, rover.getCoordinateX());
        assertEquals(4, rover.getCoordinateY());
        assertEquals(NorthDirection.class, rover.getDirection().getClass());
    }
}
