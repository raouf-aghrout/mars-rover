package com.thoughtworks.marsrover.direction;

import com.thoughtworks.marsrover.Plateau;
import com.thoughtworks.marsrover.Rover;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SouthDirectionTest {

    private Plateau plateau;
    private int xCoordinate;
    private int yCoordinate;
    private SouthDirection southDirection;
    private Rover rover;

    @Before
    public void setUp() throws Exception {
        plateau = new Plateau(5, 5);
        xCoordinate = 2;
        yCoordinate = 2;
        southDirection = new SouthDirection();
        rover = new Rover(plateau, xCoordinate, yCoordinate, southDirection);
    }

    @Test
    public void whenSouthDirectionTurnsRightNewDirectionIsWest() throws Exception {
        assertEquals(WestDirection.class, southDirection.spinRight().getClass());
    }

    @Test
    public void whenSouthDirectionTurnsLeftNewDirectionIsEast() throws Exception {
        assertEquals(EastDirection.class, southDirection.spinLeft().getClass());
    }

    @Test
    public void whenSouthDirectionMovesForwardCoordinateYDecrements() throws Exception {
        southDirection.moveForward(rover);
        assertEquals(--yCoordinate, rover.getCoordinateY());
    }
}
