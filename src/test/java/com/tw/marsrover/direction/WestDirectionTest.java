package com.tw.marsrover.direction;

import com.tw.marsrover.Plateau;
import com.tw.marsrover.Rover;
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
    public void setUp() {
        plateau = new Plateau(5, 5);
        xCoordinate = 2;
        yCoordinate = 2;
        westDirection = new WestDirection();
        rover = new Rover(plateau, xCoordinate, yCoordinate, westDirection);
    }

    @Test
    public void whenWestDirectionTurnsRightNewDirectionIsNorth() {
        assertEquals(westDirection.spinRight().getClass(), NorthDirection.class);
    }

    @Test
    public void whenWestDirectionTurnsLeftNewDirectionIsSouth() {
        assertEquals(westDirection.spinLeft().getClass(), SouthDirection.class);
    }

    @Test
    public void whenWestDirectionMovesForwardCoordinateXDecrements() {
        westDirection.moveForward(rover);
        assertEquals(--xCoordinate, rover.getCoordinateX());
    }
}
