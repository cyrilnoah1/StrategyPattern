package birds;


/**
 * Ducks have the ability of being able to swim.
 */
public class Duck extends Bird {

    /**
     * Making Birds.Duck able to swim.
     */
    public Duck() {
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
    public void performSwim() {
        super.performSwim();
    }

    @Override
    public void displayProperties() {
        super.displayProperties();
        System.out.println("I'm a " + Duck.class.getSimpleName() + ", and...");
        walk();
        sleep();
        eat();
        performSwim();
    }
}
