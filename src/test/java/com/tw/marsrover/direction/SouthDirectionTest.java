package com.tw.marsrover.direction;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class SouthDirectionTest {

    private SouthDirection southDirection;

    @Before
    public void setUp() {
        southDirection = new SouthDirection();
    }

    @Test
    public void whenSouthDirectionTurnsRightNewDirectionIsWest() {
        assertTrue(southDirection.spinRight().getClass().equals(WestDirection.class));
    }

    @Test
    public void whenSouthDirectionTurnsLeftNewDirectionIsEast() {
        assertTrue(southDirection.spinLeft().getClass().equals(EastDirection.class));
    }
}
