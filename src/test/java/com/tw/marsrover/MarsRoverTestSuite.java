package com.tw.marsrover;

import com.tw.marsrover.command.MoveForwardCommandTest;
import com.tw.marsrover.command.SpinLeftCommandTest;
import com.tw.marsrover.command.SpinRightCommandTest;
import com.tw.marsrover.direction.EastDirectionTest;
import com.tw.marsrover.direction.NorthDirectionTest;
import com.tw.marsrover.direction.SouthDirectionTest;
import com.tw.marsrover.direction.WestDirectionTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MoveForwardCommandTest.class,
        SpinLeftCommandTest.class,
        SpinRightCommandTest.class,
        EastDirectionTest.class,
        NorthDirectionTest.class,
        SouthDirectionTest.class,
        WestDirectionTest.class,
        PlateauTest.class,
        RoverTest.class
})
public class MarsRoverTestSuite {

}
