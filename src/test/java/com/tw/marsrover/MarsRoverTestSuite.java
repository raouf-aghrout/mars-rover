package com.tw.marsrover;

import com.tw.marsrover.direction.DirectionTest;
import com.tw.marsrover.plateau.PlateauTest;
import com.tw.marsrover.rover.RoverTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        DirectionTest.class,
        PlateauTest.class,
        RoverTest.class
})
public class MarsRoverTestSuite {
}
