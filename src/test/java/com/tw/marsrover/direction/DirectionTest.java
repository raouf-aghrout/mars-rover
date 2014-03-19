package com.tw.marsrover.direction;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class DirectionTest {

    @Test
    public void whenNorthDirectionTurnsRightNewDirectionIsEast() {
        Direction northDirection = new NorthDirection();
        Direction newDirection = northDirection.spinRight();
        assertTrue(newDirection.getClass().equals(EastDirection.class));
    }

    @Test
    public void whenNorthDirectionTurnsLeftNewDirectionIsWest() {
        Direction northDirection = new NorthDirection();
        Direction newDirection = northDirection.spinLeft();
        assertTrue(newDirection.getClass().equals(WestDirection.class));
    }

    @Test
    public void whenEastDirectionTurnsRightNewDirectionIsSouth() {
        Direction eastDirection = new EastDirection();
        Direction newDirection = eastDirection.spinRight();
        assertTrue(newDirection.getClass().equals(SouthDirection.class));
    }

    @Test
    public void whenEastDirectionTurnsLeftNewDirectionIsNorth() {
        Direction eastDirection = new EastDirection();
        Direction newDirection = eastDirection.spinLeft();
        assertTrue(newDirection.getClass().equals(NorthDirection.class));
    }

    @Test
    public void whenSouthDirectionTurnsRightNewDirectionIsWest() {
        Direction southDirection = new SouthDirection();
        Direction newDirection = southDirection.spinRight();
        assertTrue(newDirection.getClass().equals(WestDirection.class));
    }

    @Test
    public void whenSouthDirectionTurnsLeftNewDirectionIsEast() {
        Direction southDirection = new SouthDirection();
        Direction newDirection = southDirection.spinLeft();
        assertTrue(newDirection.getClass().equals(EastDirection.class));
    }

    @Test
    public void whenWestDirectionTurnsRightNewDirectionIsNorth() {
        Direction westDirection = new WestDirection();
        Direction newDirection = westDirection.spinRight();
        assertTrue(newDirection.getClass().equals(NorthDirection.class));
    }

    @Test
    public void whenWestDirectionTurnsLeftNewDirectionIsSouth() {
        Direction westDirection = new WestDirection();
        Direction newDirection = westDirection.spinLeft();
        assertTrue(newDirection.getClass().equals(SouthDirection.class));
    }
}
