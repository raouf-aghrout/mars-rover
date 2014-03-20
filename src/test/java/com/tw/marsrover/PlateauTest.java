package com.tw.marsrover;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PlateauTest {

    private Plateau plateau;

    @Before
    public void setUp() {
        plateau = new Plateau(5, 5);
    }

    @Test
    public void whenPlateauIsConstructedLowerLeftCoordinatesAreZeroZero() {
        assertEquals(0, plateau.getLowerBoundCoordinateX());
        assertEquals(0, plateau.getLowerBoundCoordinateY());
    }
}
