import RobotSimulationController.RobotActivity;
import java.util.Scanner;
/*
 *  This is main method which allows the user to provide the command  through the console
 */
public class Simulation {
    public static void main(String[] args) {
        RobotActivity robot1 = new RobotActivity();
        Scanner in = new Scanner(System.in);
        String input;

        /*Some housekeeping information*/
        System.out.println("NOTE : To quit, write EXIT.");
        System.out.println("Provide the sequence of commands(in capitals): ");

        /*excuete till the user provide the EXIT input*/

        do {
            input = in.nextLine();

            if (!input.equals("EXIT")) {
                if (input.equals("REPORT"))
                    System.out.print("Output: " + robot1.inputCommand(input));
                else {
                    System.out.print(robot1.inputCommand(input));
                }
            }

        }
        while(!input.equals("EXIT"));
    }

}

