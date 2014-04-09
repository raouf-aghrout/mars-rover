package com.thoughtworks.marsrover;

import com.thoughtworks.marsrover.command.MoveBackCommandTest;
import com.thoughtworks.marsrover.command.MoveForwardCommandTest;
import com.thoughtworks.marsrover.command.SpinLeftCommandTest;
import com.thoughtworks.marsrover.command.SpinRightCommandTest;
import com.thoughtworks.marsrover.direction.EastDirectionTest;
import com.thoughtworks.marsrover.direction.NorthDirectionTest;
import com.thoughtworks.marsrover.direction.SouthDirectionTest;
import com.thoughtworks.marsrover.direction.WestDirectionTest;
import com.thoughtworks.marsrover.rover.RoverOutOfBoundsExceptionTest;
import com.thoughtworks.marsrover.rover.RoverTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MoveBackCommandTest.class,
        MoveForwardCommandTest.class,
        SpinLeftCommandTest.class,
        SpinRightCommandTest.class,
        EastDirectionTest.class,
        NorthDirectionTest.class,
        SouthDirectionTest.class,
        WestDirectionTest.class,
        RoverTest.class,
        RoverOutOfBoundsExceptionTest.class,
        InputUtilTest.class,
        PlateauTest.class
})
public class MarsRoverTestSuite extends BaseTest {

}
