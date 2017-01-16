package behaviorsAndProperties;

/**
 * Grants a bird teh ability to fly.
 */
public class Fly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly.");
    }
}
