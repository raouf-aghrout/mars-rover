package com.tw.marsrover.direction;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class WestDirectionTest {

    private WestDirection westDirection;

    @Before
    public void setUp() {
        westDirection = new WestDirection();
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

    }
}
