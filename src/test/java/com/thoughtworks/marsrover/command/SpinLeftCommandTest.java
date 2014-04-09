package com.thoughtworks.marsrover.command;

import com.thoughtworks.marsrover.BaseTest;
import com.thoughtworks.marsrover.direction.NorthDirection;
import com.thoughtworks.marsrover.direction.WestDirection;
import com.thoughtworks.marsrover.rover.Rover;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SpinLeftCommandTest extends BaseTest {

    @Before
    public void setUp() throws Exception {
        direction = new NorthDirection();
        rover = new Rover(plateau, xCoordinate, yCoordinate, direction);
        command = new SpinLeftCommand();
    }

    @Test
    public void whenSpinLeftCommandIsExecutedRoverSpinsLeft() throws Exception {
        command.execute(rover);
        assertEquals(WestDirection.class, rover.getDirection().getClass());
    }
}
