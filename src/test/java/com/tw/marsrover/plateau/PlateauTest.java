package com.tw.marsrover.plateau;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class PlateauTest {

    private int upperBoundCoordinateX;
    private int upperBoundCoordinateY;
    private Plateau plateau;

    @Before
    public void setUp() {
        upperBoundCoordinateX = 5;
        upperBoundCoordinateY = 5;
        plateau = new Plateau(upperBoundCoordinateX, upperBoundCoordinateY);
    }

    @Test
    public void whenPlateauIsConstructedLowerLeftCoordinatesAreZeroZero() {
        assertTrue(plateau.getLowerBoundCoordinateX() == 0 && plateau.getLowerBoundCoordinateY() == 0);
    }
}
