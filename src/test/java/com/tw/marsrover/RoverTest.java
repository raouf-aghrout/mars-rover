package com.tw.marsrover;

import com.tw.marsrover.direction.EastDirection;
import com.tw.marsrover.direction.NorthDirection;
import com.tw.marsrover.direction.WestDirection;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class RoverTest {

    private Plateau plateau;
    private int xCoordinate;
    private int yCoordinate;
    private NorthDirection northDirection;
    private Rover rover;

    @Before
    public void setUp() {
        plateau = new Plateau(5, 5);
        xCoordinate = 2;
        yCoordinate = 2;
        northDirection = new NorthDirection();
        rover = new Rover(plateau, xCoordinate, yCoordinate, northDirection);
    }

    @Test
    public void whenRequestedRoverCanSpinRight() {
        rover.spinRight();
        assertEquals(EastDirection.class, rover.getDirection().getClass());
    }

    @Test
    public void whenRequestedRoverCanSpinLeft() {
        rover.spinLeft();
        assertEquals(WestDirection.class, rover.getDirection().getClass());
    }

    @Test
    public void whenRequestedRoverCanMoveForward() {
        rover.moveForward();
        assertEquals(++yCoordinate, rover.getCoordinateY());
    }

    @Test
    public void whenRequestedRoverCanPrintCurrentPosition() {
        assertEquals(xCoordinate + " " + yCoordinate + " " + "N", rover.broadcastLocation());
    }
}
