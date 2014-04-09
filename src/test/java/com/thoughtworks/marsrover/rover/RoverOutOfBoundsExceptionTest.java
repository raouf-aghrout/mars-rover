package com.thoughtworks.marsrover.rover;

import com.thoughtworks.marsrover.BaseTest;
import com.thoughtworks.marsrover.direction.NorthDirection;
import org.junit.Before;
import org.junit.Test;

public class RoverOutOfBoundsExceptionTest extends BaseTest {

    @Before
    public void setUp() throws Exception {
        direction = new NorthDirection();
        rover = new Rover(plateau, xCoordinate, yCoordinate, direction);
    }


    @Test(expected = RoverOutOfBoundsException.class)
    public void whenRoverMovesOutOfNorthBoundsExceptionIsThrown() {
        rover.setCoordinateX(5);
        rover.setCoordinateY(5);
        rover.moveForward();
    }

    @Test (expected = RoverOutOfBoundsException.class)
    public void whenRoverMovesOutOfEastBoundsExceptionIsThrown() {
        rover.setCoordinateX(5);
        rover.setCoordinateY(5);
        rover.spinRight();
        rover.moveForward();
    }


    @Test (expected = RoverOutOfBoundsException.class)
    public void whenRoverMovesOutOfSouthBoundsExceptionIsThrown() {
        rover.setCoordinateX(0);
        rover.setCoordinateY(0);
        rover.moveBack();
    }

    @Test (expected = RoverOutOfBoundsException.class)
    public void whenRoverMovesOutOfWestBoundsExceptionIsThrown() {
        rover.setCoordinateX(0);
        rover.setCoordinateY(0);
        rover.spinLeft();
        rover.moveForward();
    }
}
