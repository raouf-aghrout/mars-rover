package com.tw.marsrover.direction;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class NorthDirectionTest {

    private NorthDirection northDirection;

    @Before
    public void setUp() {
        northDirection = new NorthDirection();
    }

    @Test
    public void whenNorthDirectionTurnsRightNewDirectionIsEast() {
        assertTrue(northDirection.spinRight().getClass().equals(EastDirection.class));
    }

    @Test
    public void whenNorthDirectionTurnsLeftNewDirectionIsWest() {
        assertTrue(northDirection.spinLeft().getClass().equals(WestDirection.class));
    }
}
