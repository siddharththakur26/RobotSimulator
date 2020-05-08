package test.RobotSimulationModel;

import RobotSimulationModel.Position;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionTest {

    @Test
    public void placeRobotOnTable(){
        Position pos1 = new Position(0,0);
        assertEquals("It should be on table when (0,0)",true, pos1.isValidPosition());
        Position pos2 = new Position(0,4);
        assertEquals("It should be on table when (0,4)",true, pos1.isValidPosition());
        Position pos3 = new Position(4,4);
        assertEquals("It should be on table when (4,4)",true, pos2.isValidPosition());
        Position pos4 = new Position(4,0);
        assertEquals("It should be on table when (4,0)",true, pos3.isValidPosition());
        Position pos5 = new Position(2,2);
        assertEquals("It should be on table when (2,2)",true, pos5.isValidPosition());

    }

    @Test
    public void placeRobotOutsideTable(){
        Position pos1 = new Position(-1,-1);
        assertEquals("It should be on table when (0,0)",false, pos1.isValidPosition());
        Position pos2 = new Position(0,5);
        assertEquals("It should be on table when (0,5)",false, pos1.isValidPosition());
        Position pos3 = new Position(5,5);
        assertEquals("It should be on table when (5,5)",false, pos2.isValidPosition());
        Position pos4 = new Position(-1,0);
        assertEquals("It should be on table when (-1,0)",false, pos3.isValidPosition());
        Position pos5 = new Position(-2,2);
        assertEquals("It should be on table when (-2,2)",false, pos5.isValidPosition());
    }
}
