package com.tw.marsrover.direction;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SouthDirectionTest {

    private SouthDirection southDirection;

    @Before
    public void setUp() {
        southDirection = new SouthDirection();
    }

    @Test
    public void whenSouthDirectionTurnsRightNewDirectionIsWest() {
        assertEquals(WestDirection.class, southDirection.spinRight().getClass());
    }

    @Test
    public void whenSouthDirectionTurnsLeftNewDirectionIsEast() {
        assertEquals(EastDirection.class, southDirection.spinLeft().getClass());
    }

    @Test
    public void whenSouthDirectionMovesForwardCoordinateYDecrements() {

    }
}
