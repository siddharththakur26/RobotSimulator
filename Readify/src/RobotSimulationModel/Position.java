package RobotSimulationModel;

/*
 * This class represents the position of the robot in (X,Y) coordinates.
 */


public class Position {
    int x;
    int y;

    /*Initializing the constructor for position x and y*/

    public Position(int x,int y){
        this.x = x;
        this.y = y;
    }

    /* isValidPosition() represent a check whether the robot position satisfy the table length.
     *
     * @return true if robot is place within the table conditions.
     *
     */

    public  boolean isValidPosition(){
        if ( x > TableTop.TABLE_MAX || y > TableTop.TABLE_MAX || x < TableTop.TABLE_MIN || y < TableTop.TABLE_MIN || (x*y) > TableTop.TABLE_AREA)
            return false;
        return true;

    }
}
