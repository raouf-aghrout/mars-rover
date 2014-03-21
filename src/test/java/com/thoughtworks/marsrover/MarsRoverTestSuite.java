package com.thoughtworks.marsrover;

import com.thoughtworks.marsrover.command.*;
import com.thoughtworks.marsrover.direction.*;
import com.thoughtworks.marsrover.util.InputUtilTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MoveForwardCommandTest.class,
        SpinLeftCommandTest.class,
        SpinRightCommandTest.class,
        EastDirectionTest.class,
        NorthDirectionTest.class,
        SouthDirectionTest.class,
        WestDirectionTest.class,
        InputUtilTest.class,
        PlateauTest.class,
        RoverTest.class
})
public class MarsRoverTestSuite extends BaseTest {

}
