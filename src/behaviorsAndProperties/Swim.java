package behaviorsAndProperties;

/**
 * Grants a bird the ability to swim.
 */
public class Swim implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("I can swim.");
    }
}
