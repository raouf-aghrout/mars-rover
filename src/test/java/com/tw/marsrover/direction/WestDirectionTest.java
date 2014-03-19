package com.tw.marsrover.direction;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class WestDirectionTest {

    private WestDirection westDirection;

    @Before
    public void setUp() {
        westDirection = new WestDirection();
    }

    @Test
    public void whenWestDirectionTurnsRightNewDirectionIsNorth() {
        assertTrue(westDirection.spinRight().getClass().equals(NorthDirection.class));
    }

    @Test
    public void whenWestDirectionTurnsLeftNewDirectionIsSouth() {
        assertTrue(westDirection.spinLeft().getClass().equals(SouthDirection.class));
    }
}
