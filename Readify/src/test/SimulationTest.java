package test;

import RobotSimulationController.RobotActivity;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimulationTest {
    RobotActivity robot1 = new RobotActivity();
    RobotActivity robot2 = new RobotActivity();

    @Test
    public void testForPlaceMoveLeftReport() {
        String placement = "PLACE 2,2,NORTH";
        robot1.inputCommand(placement);
        robot1.inputCommand("MOVE");
        robot1.inputCommand("LEFT");
        assertEquals("2,3,WEST" + "\n", robot1.inputCommand("REPORT"));
    }

    @Test
    public void testForPlaceMoveLeftReportLeftRightReport() {
        String placement = "PLACE 2,2,NORTH";
        robot1.inputCommand(placement);
        robot1.inputCommand("MOVE");
        robot1.inputCommand("LEFT");
        assertEquals("2,3,WEST" + "\n", robot1.inputCommand("REPORT"));
        robot1.inputCommand("LEFT");
        robot1.inputCommand("RIGHT");
        assertEquals("2,3,WEST" + "\n", robot1.inputCommand("REPORT"));

    }

    @Test
    public void testForPlaceMoveLeftMoveMoveReport() {
        String placement = "PLACE 1,2,NORTH";
        robot1.inputCommand(placement);
        robot1.inputCommand("MOVE");
        robot1.inputCommand("LEFT");
        robot1.inputCommand("MOVE");
        robot1.inputCommand("MOVE");
        assertEquals("0,3,WEST" + "\n", robot1.inputCommand("REPORT"));
    }

    @Test
    public void testPositionOfTwoRobotsWhenSecondRobotIsMoved(){
        String command1 = "PLACE 0,0,NORTH";
        robot1.inputCommand(command1);
        command1 = "MOVE";
        robot1.inputCommand(command1);
        assertEquals("0,1,NORTH"+"\n",robot1.inputCommand("REPORT"));
        String command2 = "PLACE 2,2,NORTH";
        robot2.inputCommand(command2);
        assertEquals("2,2,NORTH"+"\n",robot2.inputCommand("REPORT"));

    }
}
