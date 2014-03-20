package com.tw.marsrover;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class PlateauTest {

    private Plateau plateau;

    @Before
    public void setUp() {
        plateau = new Plateau(5, 5);
    }

    @Test
    public void whenPlateauIsConstructedLowerLeftCoordinatesAreZeroZero() {
        assertTrue(plateau.getLowerBoundCoordinateX() == 0 && plateau.getLowerBoundCoordinateY() == 0);
    }
}
