package RobotSimulationModel;

/* This enumeration is representing the direction of the robot that is going to face.
 * As from requirements - There are only four directions - North,EAST,SOUTH,WEST arranged in circulatory motion
 *
 * Direction enum also consist of two enum functions - rotateLeft(), and rotateRight();
 * These functions are used in order to change the direction 90 degree anti-clockwise and clockwise direction of the robot respectively.
 *
 * North can rotate clockwise to East and North can rotate anti-clockwise to West. Similarly, South can rotate clockwise to West
 * and South can rotate anti-clockwise to East.
 *
 *
 */

public enum Direction {
    NORTH, EAST, SOUTH, WEST;

    /* rotateLeft() function changes the direction of robot which it is currently facing
     *
     * @param this.ordinal is used to get the index of the input direction
     * @return returns the direction after rotating it anti-clockwise or -90 degree
     *
     */

    public Direction rotateLeft(){
        if (this.ordinal() != 0)
            return Direction.values()[this.ordinal() - 1];
        else
            return Direction.values()[Direction.values().length-1];
    }


    /* rotateRight() function changes the direction of robot which it is currently facing
     *
     * @param this.ordinal is used to get the index of the input direction
     * @return returns the direction after rotating it clockwise or 90 degree
     *
     */
    public Direction rotateRight(){
        if (this.ordinal() != (Direction.values().length-1))
            return Direction.values()[this.ordinal() + 1];
        else
            return Direction.values()[0];

    }

}
