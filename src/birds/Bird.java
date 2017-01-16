package birds;

import behaviorsAndProperties.FlyBehavior;
import behaviorsAndProperties.SprintBehavior;
import behaviorsAndProperties.SwimBehavior;

/**
 * Parent class for all the birds.
 */
public abstract class Bird {
    // Behavior interfaces that will make birds gain additional abilities.
    SwimBehavior swimBehavior;
    SprintBehavior sprintBehavior;
    FlyBehavior flyBehavior;

    /**
     * Makes sure that all birds can walk.
     */
    public void walk() {
        System.out.println("I can walk.");
    }

    /**
     * Makes sure that all birds can eat.
     */
    public void eat() {
        System.out.println("I can eat.");
    }

    /**
     * Makes sure that all birds can sleep.
     */
    public void sleep() {
        System.out.println("I can sleep.");
    }

    /**
     * Gives birds the ability the fly.
     */
    public void performFly() {
        try {
            flyBehavior.fly();
        } catch (NullPointerException nPE) {
            throw new NullPointerException("The ability to fly cannot be applied to the bird.");
        }
    }

    /**
     * Gives birds the ability to swim.
     */
    public void performSwim() {
        try {
            swimBehavior.swim();
        } catch (NullPointerException nPE) {
            throw new NullPointerException("The ability to swim cannot be applied to the bird.");
        }
    }

    /**
     * Gives birds the ability to sprint.
     */
    public void performSprint() {
        try {
            sprintBehavior.sprint();
        } catch (NullPointerException nPE) {
            throw new NullPointerException("The ability to sprint cannot be applied to the bird.");
        }
    }

    /**
     * Displays all the properties of the currently instantiated bird.
     */
    public void displayProperties() {
        // functionality written in the sub classes.
    }

    // Behavior setters.
    public  void setSwimBehavior(SwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }
    public void setSprintBehavior(SprintBehavior sprintBehavior) {
        this.sprintBehavior = sprintBehavior;
    }
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
