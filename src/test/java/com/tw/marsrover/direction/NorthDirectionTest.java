package com.tw.marsrover.direction;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class NorthDirectionTest {

    private NorthDirection northDirection;

    @Before
    public void setUp() {
        northDirection = new NorthDirection();
    }

    @Test
    public void whenNorthDirectionTurnsRightNewDirectionIsEast() {
        assertEquals(EastDirection.class, northDirection.spinRight().getClass());
    }

    @Test
    public void whenNorthDirectionTurnsLeftNewDirectionIsWest() {
        assertEquals(WestDirection.class, northDirection.spinLeft().getClass());
    }

    @Test
    public void whenNorthDirectionMovesForwardCoordinateYIncrements() {

    }
}
