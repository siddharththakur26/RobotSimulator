package test.RobotSimulationModel;

import RobotSimulationModel.Direction;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DirectionTest {
    @Test
    public void rotateFromNorthtoEast(){
        assertEquals("It should be EAST", Direction.EAST, Direction.NORTH.rotateRight());

    }
    @Test
    public void rotateFromSouthtoWest(){
        assertEquals("It should be WEST", Direction.WEST, Direction.SOUTH.rotateRight());

    }

    @Test
    public void rotateFromWesttoSouth(){
        assertEquals("It should be SOUTH", Direction.SOUTH, Direction.WEST.rotateLeft());

    }

    @Test
    public void rotateFromEasttoNorth(){
        assertEquals("It should be NORTH", Direction.NORTH, Direction.EAST.rotateLeft());

    }


    @Test
    public void rotateFromNorthtoWest(){
        assertEquals("It should be WEST", Direction.WEST, Direction.NORTH.rotateLeft());

    }

    @Test
    public void rotateFromWesttoNorth(){
        assertEquals("It should be NORTH", Direction.NORTH, Direction.WEST.rotateRight());

    }

}
