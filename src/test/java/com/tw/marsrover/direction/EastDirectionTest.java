package com.tw.marsrover.direction;

import com.tw.marsrover.Plateau;
import com.tw.marsrover.Rover;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class EastDirectionTest {

    private Plateau plateau;
    private int xCoordinate;
    private int yCoordinate;
    private EastDirection eastDirection;
    private Rover rover;

    @Before
    public void setUp() {
        plateau = new Plateau(5, 5);
        xCoordinate = 2;
        yCoordinate = 2;
        eastDirection = new EastDirection();
        rover = new Rover(plateau, xCoordinate, yCoordinate, eastDirection);
    }

    @Test
    public void whenEastDirectionTurnsRightNewDirectionIsSouth() {
        assertEquals(SouthDirection.class, eastDirection.spinRight().getClass());
    }

    @Test
    public void whenEastDirectionTurnsLeftNewDirectionIsNorth() {
        assertEquals(NorthDirection.class, eastDirection.spinLeft().getClass());
    }

    @Test
    public void whenEastDirectionMovesForwardCoordinateXIncrements() {
        eastDirection.moveForward(rover);
        assertEquals(++xCoordinate, rover.getCoordinateX());
    }
}
