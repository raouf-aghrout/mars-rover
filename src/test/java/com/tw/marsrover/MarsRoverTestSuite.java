package com.tw.marsrover;

import com.tw.marsrover.command.CommandTest;
import com.tw.marsrover.direction.EastDirectionTest;
import com.tw.marsrover.direction.NorthDirectionTest;
import com.tw.marsrover.direction.SouthDirectionTest;
import com.tw.marsrover.direction.WestDirectionTest;
import com.tw.marsrover.exception.ExceptionTest;
import com.tw.marsrover.plateau.PlateauTest;
import com.tw.marsrover.rover.RoverTest;
import com.tw.marsrover.utils.UtilsTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CommandTest.class,
        EastDirectionTest.class,
        NorthDirectionTest.class,
        SouthDirectionTest.class,
        WestDirectionTest.class,
        ExceptionTest.class,
        PlateauTest.class,
        RoverTest.class,
        UtilsTest.class
})
public class MarsRoverTestSuite {
}
