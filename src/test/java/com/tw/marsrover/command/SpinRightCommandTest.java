package com.tw.marsrover.command;

import com.tw.marsrover.Plateau;
import com.tw.marsrover.Rover;
import com.tw.marsrover.direction.EastDirection;
import com.tw.marsrover.direction.NorthDirection;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SpinRightCommandTest {

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
        command = new SpinRightCommand();
    }

    @Test
    public void whenSpinRightCommandIsExecutedRoverSpinsRight() {
        command.execute(rover);
        assertEquals(EastDirection.class, rover.getDirection().getClass());
    }
}
