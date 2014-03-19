package com.tw.marsrover.rover;

import com.tw.marsrover.direction.Direction;
import com.tw.marsrover.direction.NorthDirection;
import com.tw.marsrover.plateau.Plateau;
import org.junit.Before;

public class RoverTest {

    private int xCoordinate;
    private int yCoordinate;
    private Direction direction;
    private Plateau plateau;
    private Rover rover;

    @Before
    public void setUp() {
        xCoordinate = 1;
        yCoordinate = 2;
        direction = new NorthDirection();
        plateau = new Plateau(5, 5);
        rover = new Rover(xCoordinate, yCoordinate, direction, plateau);
    }
}
