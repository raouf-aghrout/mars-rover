package com.tw.marsrover;

import com.tw.marsrover.direction.EastDirectionTest;
import com.tw.marsrover.direction.NorthDirectionTest;
import com.tw.marsrover.direction.SouthDirectionTest;
import com.tw.marsrover.direction.WestDirectionTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        // TODO : Add more tests
        EastDirectionTest.class,
        NorthDirectionTest.class,
        SouthDirectionTest.class,
        WestDirectionTest.class,
        PlateauTest.class
})
public class MarsRoverTestSuite {
}
