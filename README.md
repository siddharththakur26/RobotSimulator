# ToyBotPuzzle
* The library allows for a simulation of a toy robot moving on a 5 x 5 square tabletop. <br />
* There are no obstructions on the table surface. <br />
* The robot is free to roam around the surface of the table, but must be prevented from falling to destruction. Any movement that would result in this must be prevented, however further valid movement commands must still be allowed. <br />
* PLACE will put the toy robot on the table in position X,Y and facing NORTH, SOUTH, EAST or WEST.<br />
* (0,0) can be considered as the SOUTH WEST corner and (4,4) as the NORTH EAST corner.<br />
* The first valid command to the robot is a PLACE command. After that, any sequence of commands may be issued, in any order, including another PLACE command. The library should discard all commands in the sequence until a valid PLACE command has been executed. <br />
* The PLACE command should be discarded if it places the robot outside of the table surface.<br />
* MOVE will move the toy robot <br />	
* LEFT and RIGHT will rotate the robot 90 degrees in the specified direction without changing the position of the robot.<br />
* REPORT will announce the X,Y and orientation of the robot. <br />
* A robot that is not on the table can choose to ignore the MOVE, LEFT, RIGHT and REPORT commands.<br />
* The library should discard all invalid commands and parameters. <br />
