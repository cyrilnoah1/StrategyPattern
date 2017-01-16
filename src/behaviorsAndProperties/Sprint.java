package behaviorsAndProperties;

/**
 * Grants a bird the ability to sprint.
 */
public class Sprint implements SprintBehavior {
    @Override
    public void sprint() {
        System.out.println("I can run very fast.");
    }
}
