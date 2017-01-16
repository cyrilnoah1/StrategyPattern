package birds;

/**
 * Eagles have the ability of flying.
 */
public class Eagle extends Bird {

    /**
     * Making Birds.Eagle able to fly.
     */
    public Eagle() {
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void performFly() {
        super.performFly();
    }

    @Override
    public void displayProperties() {
        super.displayProperties();
        System.out.println("I'm an " + Eagle.class.getSimpleName() + ", and...");
        walk();
        sleep();
        eat();
        performFly();
    }
}
