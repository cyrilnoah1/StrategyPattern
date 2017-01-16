import behaviorsAndProperties.Fly;
import behaviorsAndProperties.Sprint;
import behaviorsAndProperties.Swim;
import birds.*;

import java.util.Scanner;

/**
 * Class containing main method.
 */
public class MainClass {
    private final String TAG = MainClass.class.getSimpleName();
    private static final Scanner scan = new Scanner(System.in);

    /**
     * Main method.
     *
     * @param args String arguments.
     */
    public static void main(String args[]) {
        // To show required bird's properties to the user.
        birdProperties();
    }

    /**
     * Method to show required bird's properties to the user.
     */
    private static void birdProperties() {
        System.out.println("Enter the required bird:\nHen\nDuck\nEagle\nRoadRunner\n   : ");

        // Scanning user input for the type of bird required.
        String birdName = scan.next();

        if (birdName.equalsIgnoreCase("duck")) {
            Bird duck = new Duck();
            duck.setSwimBehavior(new Swim());
            duck.displayProperties();
            System.out.print("\n");
        } else if (birdName.equalsIgnoreCase("eagle")) {
            Bird eagle = new Eagle();
            eagle.setFlyBehavior(new Fly());
            eagle.displayProperties();
            System.out.print("\n");
        } else if (birdName.equalsIgnoreCase("hen")) {
            Bird hen = new Hen();
            hen.displayProperties();
            System.out.print("\n");
        } else if (birdName.equalsIgnoreCase("roadRunner")) {
            Bird roadRunner = new RoadRunner();
            roadRunner.setSprintBehavior(new Sprint());
            roadRunner.displayProperties();
            System.out.print("\n");
        } else {
            System.out.println("Invalid bird name.");
            birdProperties();
        }
    }
}
