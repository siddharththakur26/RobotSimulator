package RobotSimulationModel;

/* This class represent the robot property and behaviours.
 *
 * Robot Attributes:
 *  - x : x co-ordinate of the robot
 *  - y : y co-ordinate of the robot
 *  - place : boolean in order to know whether robot has been placed correctly on the table. If it is true then robot is placed correctly.
 *  - flag : boolean in order to check whether the next position of the robot is out of the table or not.
 *  - place and flag variable is ensuring the safety of the robot.
 *
 *  Robot behaviours:
 *  - move() :
 *  - faceLeft() :
 *  - faceRight() :
 *  - generateReport() :
 */

public class Robot {

    int x ;
    int y ;
    public static boolean place = false ;
    private Direction face;
    public static boolean flag;



    /*place() function represents to initialize the class variables such as
    * x = x-coordinates
    * y = y-coordinates
    * face = current direction of the robot (NORTH|EAST|SOUT|WEST)
    * place = true if the robot is correctly placed
    *
    * @param x,y,and face
    */
    public void place(int x, int y, Direction face){
           this.x = x;
           this.y = y;
           this.face = face;
           this.place = true;

    }

    /*move() funtions allows to move robot in one unit forward in the direction it is currently facing.*/
    public void move(){
        if (place)
            robotMovement();

    }

    /* robotMovement() functions allows to check the robot direction then verify it whether new position is valid or not and
     * if it is valid then update the x or y position correspondingly by one unit
     * */
    private void robotMovement() {

        if (face == Direction.NORTH){
            Position pos = new Position( x,y+1);
            if (pos.isValidPosition()){
                y = y+1;
                flag = true;
            }
            else
                flag = false;
        }
        else if (face == Direction.SOUTH){
            Position pos = new Position( x,y-1);
            if (pos.isValidPosition()){
                y = y-1;
                flag = true;
            }
            else
                flag = false;
        }
        else if (face == Direction.EAST){
            Position pos = new Position( x+1,y);
            if (pos.isValidPosition()){
                x = x + 1;
                flag = true;
            }
            else
                flag = false;
        }
        else if (face == Direction.WEST){
            Position pos = new Position( x-1,y);
            if (pos.isValidPosition()){
                x = x -1;
                flag = true;
            }
            else
                flag = false;
        }

    }

    /* faceLeft() functions changes the direction of the robot in anti-clockwise direction by 90 from the current direction of robot
     * NOTE : This functions doesn't change the position of the robot.
     */

    public void faceLeft(){
        if (place){
            face = face.rotateLeft();

        }

    }
    /* faceRight() functions changes the direction of the robot in clockwise direction by 90 from the current direction of robot
     * NOTE : This functions doesn't change the position of the robot.
     */
    public void faceRight(){
        if (place){
            face = face.rotateRight();
        }

    }

    /* generateReport() functions returns the coordinates and direction in which robot is currently facing.
     *
     * @return return string of class variables x,y, and face if robot is already placed
     * otherwise it returns string "Robot has not been placed."
     *
     */
    public String generateReport(){
        if (place){
            return ""+ x +","+ y +","+ face +"\n";
        }
        return "Robot has not been placed"+"\n";

    }



}
