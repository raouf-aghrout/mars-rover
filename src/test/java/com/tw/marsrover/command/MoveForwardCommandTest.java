package com.tw.marsrover.command;

import com.tw.marsrover.Plateau;
import com.tw.marsrover.Rover;
import com.tw.marsrover.direction.NorthDirection;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MoveForwardCommandTest {

    private Plateau plateau;
    private int xCoordinate;
    private int yCoordinate;
    private NorthDirection northDirection;
    private Rover rover;
    private Command command;

    @Before
    public void setUp() {
        plateau = new Plateau(5, 5);
        xCoordinate = 2;
        yCoordinate = 2;
        northDirection = new NorthDirection();
        rover = new Rover(plateau, xCoordinate, yCoordinate, northDirection);
        command = new MoveForwardCommand();
    }

    @Test
    public void whenMoveForwardCommandIsExecutedRoverMovesForward() {
        command.execute(rover);
        assertEquals(++yCoordinate, rover.getCoordinateY());
    }
}
