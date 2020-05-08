package test.RobotSimulationModel;

import RobotSimulationModel.Direction;
import RobotSimulationModel.Robot;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobotTest {
    @Test
    public void printRobotPositionAndDirection(){
        Robot obj = new Robot();
        obj.place(0,0, Direction.NORTH);
        assertEquals("It is should be expecting: 0,0,NORTH","0,0,NORTH"+"\n",obj.generateReport());

    }
    @Test
    public void printRobotPositionAndDirectionWhenNotYetPlaced(){
        Robot obj = new Robot();
        Robot.place = false;
        assertEquals("Robot has not been placed"+"\n",obj.generateReport());

    }
}
