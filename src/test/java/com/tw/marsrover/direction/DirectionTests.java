package com.tw.marsrover.direction;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class DirectionTests {

    @Test
    public void whenNorthDirectionTurnsRightDirectionIsEast() {
        Direction northDirection = new NorthDirection();
        Direction newDirection = northDirection.spinRight();
        assertTrue(newDirection.getClass().equals(EastDirection.class));
    }

    @Test
    public void whenNorthDirectionTurnsLeftDirectionIsWest() {
        Direction northDirection = new NorthDirection();
        Direction newDirection = northDirection.spinLeft();
        assertTrue(newDirection.getClass().equals(WestDirection.class));
    }

    @Test
    public void whenEastDirectionTurnsRightDirectionIsSouth() {
        Direction eastDirection = new EastDirection();
        Direction newDirection = eastDirection.spinRight();
        assertTrue(newDirection.getClass().equals(SouthDirection.class));
    }

    @Test
    public void whenEastDirectionTurnsLeftDirectionIsNorth() {
        Direction eastDirection = new EastDirection();
        Direction newDirection = eastDirection.spinLeft();
        assertTrue(newDirection.getClass().equals(NorthDirection.class));
    }

    @Test
    public void whenSouthDirectionTurnsRightDirectionIsWest() {
        Direction southDirection = new SouthDirection();
        Direction newDirection = southDirection.spinRight();
        assertTrue(newDirection.getClass().equals(WestDirection.class));
    }

    @Test
    public void whenSouthDirectionTurnsLeftDirectionIsEast() {
        Direction southDirection = new SouthDirection();
        Direction newDirection = southDirection.spinLeft();
        assertTrue(newDirection.getClass().equals(EastDirection.class));
    }

    @Test
    public void whenWestDirectionTurnsRightDirectionIsNorth() {
        Direction westDirection = new WestDirection();
        Direction newDirection = westDirection.spinRight();
        assertTrue(newDirection.getClass().equals(NorthDirection.class));
    }

    @Test
    public void whenWestDirectionTurnsLeftDirectionIsSouth() {
        Direction westDirection = new WestDirection();
        Direction newDirection = westDirection.spinLeft();
        assertTrue(newDirection.getClass().equals(SouthDirection.class));
    }
}
