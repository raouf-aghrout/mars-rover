package com.thoughtworks.marsrover.direction;

import com.thoughtworks.marsrover.Plateau;
import com.thoughtworks.marsrover.Rover;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class WestDirectionTest {

    private Plateau plateau;
    private int xCoordinate;
    private int yCoordinate;
    private WestDirection westDirection;
    private Rover rover;

    @Before
    public void setUp() throws Exception {
        plateau = new Plateau(5, 5);
        xCoordinate = 2;
        yCoordinate = 2;
        westDirection = new WestDirection();
        rover = new Rover(plateau, xCoordinate, yCoordinate, westDirection);
    }

    @Test
    public void whenWestDirectionTurnsRightNewDirectionIsNorth() throws Exception {
        assertEquals(westDirection.spinRight().getClass(), NorthDirection.class);
    }

    @Test
    public void whenWestDirectionTurnsLeftNewDirectionIsSouth() throws Exception {
        assertEquals(westDirection.spinLeft().getClass(), SouthDirection.class);
    }

    @Test
    public void whenWestDirectionMovesForwardCoordinateXDecrements() throws Exception {
        westDirection.moveForward(rover);
        assertEquals(--xCoordinate, rover.getCoordinateX());
    }
}
