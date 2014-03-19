package com.tw.marsrover.direction;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class EastDirectionTest {

    private EastDirection eastDirection;

    @Before
    public void setUp() {
        eastDirection = new EastDirection();
    }

    @Test
    public void whenEastDirectionTurnsRightNewDirectionIsSouth() {
        assertTrue(eastDirection.spinRight().getClass().equals(SouthDirection.class));
    }

    @Test
    public void whenEastDirectionTurnsLeftNewDirectionIsNorth() {
        assertTrue(eastDirection.spinLeft().getClass().equals(NorthDirection.class));
    }
}
