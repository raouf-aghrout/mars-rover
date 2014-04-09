package com.thoughtworks.marsrover.rover;

import com.thoughtworks.marsrover.BaseTest;
import com.thoughtworks.marsrover.direction.NorthDirection;
import org.junit.Before;
import org.junit.Test;

public class LocationOutOfBoundsExceptionTest extends BaseTest {

    @Before
    public void setUp() throws Exception {
        direction = new NorthDirection();
        rover = new Rover(plateau, xCoordinate, yCoordinate, direction);
    }


    @Test(expected = LocationOutOfBoundsException.class)
    public void whenRoverAttemptsToMoveOutOfNorthBoundsExceptionIsThrown() {
        rover.setCoordinateX(5);
        rover.setCoordinateY(5);
        rover.moveForward();
    }

    @Test (expected = LocationOutOfBoundsException.class)
    public void whenRoverAttemptsToMoveOutOfEastBoundsExceptionIsThrown() {
        rover.setCoordinateX(5);
        rover.setCoordinateY(5);
        rover.spinRight();
        rover.moveForward();
    }


    @Test (expected = LocationOutOfBoundsException.class)
    public void whenRoverAttemptsToMoveOutOfSouthBoundsExceptionIsThrown() {
        rover.setCoordinateX(0);
        rover.setCoordinateY(0);
        rover.moveBack();
    }

    @Test (expected = LocationOutOfBoundsException.class)
    public void whenRoverAttemptsToMoveOutOfWestBoundsExceptionIsThrown() {
        rover.setCoordinateX(0);
        rover.setCoordinateY(0);
        rover.spinLeft();
        rover.moveForward();
    }
}
