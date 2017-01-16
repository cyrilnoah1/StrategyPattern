package birds;

/**
 * Road Runners have the ability of running really fast.
 */
public class RoadRunner extends Bird {

    /**
     * Making Road Runner bird able to run at high speeds.
     */
    public RoadRunner() {
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void performSprint() {
        super.performSprint();
    }

    @Override
    public void displayProperties() {
        super.displayProperties();
        System.out.println("I'm a " + RoadRunner.class.getSimpleName() + ", and...");
        walk();
        sleep();
        eat();
        performSprint();
    }
}
