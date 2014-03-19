package com.tw.marsrover;

import com.tw.marsrover.direction.DirectionTest;
import com.tw.marsrover.plateau.PlateauTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        DirectionTest.class,
        PlateauTest.class
})
public class MarsRoverTestSuite {
}
