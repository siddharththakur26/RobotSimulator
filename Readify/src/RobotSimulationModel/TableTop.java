package RobotSimulationModel;

public class TableTop {
    /* This class is representing the Table on which the robot must be placed and move freely.
     * - Table is of size 5 x 5.
     * - Below are the positions(co-ordinates) are visualized for the table
     *  (0,0) is considered as SOUTH-WEST corner.
     *  (4,4) is considered as NORTH_EAST corner.
     *  (2,2) is the center.
     */

    // Table is of 5 x 5
    /* Visualization of the table
        0,4   1,4  2,4   3,4   4,4

        0,3   1,3  2,3   3,3   4,3

        0,2   1,2  2,2   3,2   4,2

        0,1   1,1  2,1   3,1   4,1

        0,0   1,0  2,0   3,0   4,0
     */
    /* Declaring the area of the table */
    public static final int TABLE_AREA = 25;

    /*Declaring the minimum, maximum values for the co-ordinates of the table*/
    public static final int TABLE_MIN = 0;
    public static final int TABLE_MAX = 4;
}
