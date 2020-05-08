package RobotSimulationController;

import RobotSimulationModel.Direction;
import RobotSimulationModel.Position;
import RobotSimulationModel.Robot;

/*
 * This class representing the control over class Robot. It uses the inputs supplied through console and directs those
 * inputs to different properties of Robot class.
 *
 * RobotActivity Attributes:
 *  -robot:
 *  It is is of type of Robot which is used to access the Robot class variables and methods
 *
 *  -inputCommand(): this function takes the command and call the function in the robot class correspondingly.
 *  command = MOVE
 *  It updates the positions of the robot by validating the position with x and y values. Otherwise for invalid positions,
 *  robot stays on the same position.
 *  command = LEFT
 *  It rotates the robot anti-clockwise position by calling rotateLeft() function
 *  command = RIGHT
 *  It rotates the robot clockwise position by calling rotateRight() function
 *  command = REPORT
 *  It display the output in "Output: X,Y,DIRECTION"
 *  command = PLACE
 *  it is the first command that needs to be supplied otherwise no other command is effective. PLACE command must supply
 *  x and y position and current facing direction of the robot.
 *
 *
 */
public class RobotActivity {
    private Robot robot;

    public RobotActivity() {
        robot = new Robot();
    }

    /* @param command of string type. command can be in this : "PLACE 1,1,NORTH", "MOVE", "LEFT", "RIGHT", "REPORT"
 *      PLACE X,Y,DIRECTION
 *      MOVE
 *      LEFT
 *      RIGHT
 *      REPORT
 *  @return return blank if no command is supplied, return position and direction of the robot when REPORT command is supplied
 *  and returns nothing if REPORT command is not called. It returns "Robot is not placed yet" if the PLACE command is not supplied.
 *  it returns "invalid position" if robot moves to invalid position and it returns "Check the Command" for every wrong input.
 *  */

    public String inputCommand(String command) {
        if (!command.equals("")) {
            switch (command) {
                case "MOVE":
                    robot.move();
                    if (Robot.flag == false && Robot.place == true)
                        return "Invalid Position." + "\n";
                    else if (Robot.place == false)
                        return "Robot is not placed yet." + "\n";
                    break;
                case "LEFT":
                    robot.faceLeft();
                    if (Robot.place == false)
                        return "Robot is not placed yet." + "\n";
                    break;
                case "RIGHT":
                    robot.faceRight();
                    if (Robot.place == false)
                        return "Robot is not placed yet." + "\n";
                    break;
                case "REPORT":
                    if (Robot.place == false)
                        return "Robot is not placed yet." + "\n";
                    return robot.generateReport();

                default:
                    String[] placementCommand = splitPlaceCommand(command);

                    if (isValidPlacement(placementCommand))
                        place(placementCommand);
                    else
                        return "Check the Command" + "\n";
            }

        }
        return "";

    }


    /*
 *      This functions split the place command into array of {command,x,y,direction}.
 *
 *      @param command input
 *      PLACE X,Y,DIRECTION
 *
 *      @return blank array of string if the wrong place command has been given. otherwise it returns the array of string
 *      where [0] = "PLACE", [1] = "X" , [2] = "Y" , [3] = [DIRECTION]
 *
    */


    private String[] splitPlaceCommand(String command) {
        String[] inputCommand = command.split("\\s");

        String placeCommand = inputCommand[0];
        if (placeCommand.equals("PLACE")) {
            try {
                String[] inputPlacement = inputCommand[1].split(",");

                String xPosition = inputPlacement[0];
                String yPosition = inputPlacement[1];

                String direction = inputPlacement[2];
                String[] placementCommand = {placeCommand, xPosition, yPosition, direction};

                return placementCommand;
            } catch (Exception e) {
                //System.out.println(e);
                /*A error has been occured.*/

            }
        }

        return new String[]{""};

    }

    /*
*      isValidPlacement() function validates the positions and direction supplied with place command are correct or not.
*
*      @param array of string of the place command in the form of {"PLACE", "X","Y","DIRECTION"}
*
*      @return it returns true if command type is correct, Position values are correct and direction is correct. Otherwise
*      it returns false if any of the variable such as position, or direction fail.
*
*   */

    private boolean isValidPlacement(String[] placementCommand) {
        if (placementCommand[0].equals("PLACE")) {
            try {
                int xposition = Integer.parseInt(placementCommand[1]);
                int yposition = Integer.parseInt(placementCommand[2]);

                Position pos = new Position(xposition, yposition);

                if (pos.isValidPosition()) {
                    String direction = placementCommand[3];
                    if (Direction.values()[0].toString().equals(direction) || Direction.values()[1].toString().equals(direction) ||
                            Direction.values()[2].toString().equals(direction) || Direction.values()[3].toString().equals(direction)) {
                        return true;
                    }
                }
            } catch (Exception e) {
                //System.out.println(e);
                /*A error has been occured.*/

            }

        }
        return false;

    }

/*
 * place() function calls the place() function of Robot class.
 *
 * @param X-position,Y-position,direction
 */


    private void place(String[] command) {
        int xposition = Integer.parseInt(command[1]);
        int yposition = Integer.parseInt(command[2]);
        Direction face = Direction.valueOf(command[3]);

        robot.place(xposition, yposition, face);


    }


}
