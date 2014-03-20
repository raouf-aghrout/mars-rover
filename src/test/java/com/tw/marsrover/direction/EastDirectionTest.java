package com.tw.marsrover.direction;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class EastDirectionTest {

    private EastDirection eastDirection;

    @Before
    public void setUp() {
        eastDirection = new EastDirection();
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

    }
}
