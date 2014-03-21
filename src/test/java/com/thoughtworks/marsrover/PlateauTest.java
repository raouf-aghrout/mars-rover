package com.thoughtworks.marsrover;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PlateauTest extends BaseTest {

    @Test
    public void whenPlateauIsConstructedLowerLeftCoordinatesAreZeroZero() throws Exception {
        assertEquals(0, plateau.getLowerBoundCoordinateX());
        assertEquals(0, plateau.getLowerBoundCoordinateY());
    }
}
