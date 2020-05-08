package test.RobotSimulationController;

import RobotSimulationController.RobotActivity;
import RobotSimulationModel.Robot;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class RobotActivityTest {
    RobotActivity r1 = new RobotActivity();
    @Test
    public void moveRobotWhenRobotIsNotPlaced(){
        //RobotActivity r1 = new RobotActivity();
        String command = "MOVE";
        String expected = "Robot is not placed yet."+"\n";
        Robot.place = false;
        assertEquals(expected,r1.inputCommand(command));

    }
    @Test
    public void rotateRobotLeftWhenRobotIsNotPlaced(){
        //RobotActivity r1 = new RobotActivity();
        String command = "LEFT";
        String expected = "Robot is not placed yet."+"\n";
        Robot.place = false;
        assertEquals(expected,r1.inputCommand(command));

    }
    @Test
    public void rotateRobotRightWhenRobotIsNotPlaced(){

        String command = "RIGHT";
        String expected = "Robot is not placed yet."+"\n";
        Robot.place = false;
        assertEquals(expected,r1.inputCommand(command));

    }
    @Test
    public void reportRobotPositionWhenRobotIsNotPlaced(){
        //RobotActivity r2 = new RobotActivity();
        String command = "REPORT";
        String expected = "Robot is not placed yet."+"\n";
        assertEquals(expected,r1.inputCommand(command));

    }
    @Test
    public void reportRobotPositionAfterPlacement(){
        //RobotActivity r1 = new RobotActivity();
        String command = "PLACE 0,1,NORTH";
        r1.inputCommand(command);
        command = "REPORT";
        String expected = "0,1,NORTH"+"\n";
        assertEquals(expected,r1.inputCommand(command));

    }
    @Test
    public void reportRobotPositionAfterMovingItTowardsNorth(){
       // RobotActivity r1 = new RobotActivity();
        String command = "PLACE 0,1,NORTH";
        r1.inputCommand(command);
        command = "MOVE";
        r1.inputCommand(command);
        command = "REPORT";
        String expected = "0,2,NORTH"+"\n";
        assertEquals(expected,r1.inputCommand(command));

    }

    @Test
    public void reportRobotPositionAfterMovingItTowardsSorth(){
       // RobotActivity r1 = new RobotActivity();
        String command = "PLACE 0,1,SOUTH";
        r1.inputCommand(command);
        command = "MOVE";
        r1.inputCommand(command);
        command = "REPORT";
        String expected = "0,0,SOUTH"+"\n";
        assertEquals(expected,r1.inputCommand(command));

    }
    @Test
    public void reportRobotPositionAfterMovingItTowardsEast(){
       // RobotActivity r1 = new RobotActivity();
        String command = "PLACE 0,1,EAST";
        r1.inputCommand(command);
        command = "MOVE";
        r1.inputCommand(command);
        command = "REPORT";
        String expected = "1,1,EAST"+"\n";
        assertEquals(expected,r1.inputCommand(command));
    }
    @Test
    public void reportRobotPositionAfterMovingItTowardsWest(){
       // RobotActivity r1 = new RobotActivity();
        String command = "PLACE 1,1,WEST";
        r1.inputCommand(command);
        command = "MOVE";
        r1.inputCommand(command);
        command = "REPORT";
        String expected = "0,1,WEST"+"\n";
        assertEquals(expected,r1.inputCommand(command));
    }

    @Test
    public void reportRobotPositionAfterMovingOffTheTableFromWest(){
       // RobotActivity r1 = new RobotActivity();
        String command = "PLACE 0,1,WEST";
        r1.inputCommand(command);
        command = "MOVE";
        r1.inputCommand(command);
        command = "REPORT";
        String expected = "0,1,WEST"+"\n";
        assertEquals(expected,r1.inputCommand(command));
    }

    @Test
    public void reportRobotPositionAfterMovingOffTheTableFromEast(){
        //RobotActivity r1 = new RobotActivity();
        String command = "PLACE 4,2,EAST";
        r1.inputCommand(command);
        command = "MOVE";
        r1.inputCommand(command);
        command = "REPORT";
        String expected = "4,2,EAST"+"\n";
        assertEquals(expected,r1.inputCommand(command));
    }

    @Test
    public void VerfiyCommandWithWrongNumberofInputs(){
        String command = "PLACE 55,NORTH";
       // RobotActivity r1 = new RobotActivity();
        assertEquals("Check the Command"+"\n",r1.inputCommand(command));
        command = "PLACE 55,55";
        assertEquals("Check the Command"+"\n",r1.inputCommand(command));
        command = "55 55,55";
        assertEquals("Check the Command"+"\n",r1.inputCommand(command));
        command = "PLACE 0,1,NORTH";
        r1.inputCommand(command);
        command = "mvc";
        assertEquals("Check the Command"+"\n",r1.inputCommand(command));
        command = "Left";
        assertEquals("Check the Command"+"\n",r1.inputCommand(command));
    }

    @Test
    public void testBlankCommand(){
        String command = "";
        //RobotActivity r1 = new RobotActivity();
        assertEquals("",r1.inputCommand(command));


    }



}
