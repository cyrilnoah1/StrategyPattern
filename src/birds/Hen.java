package birds;

/**
 * Hens do not possess any additional abilities.
 */
public class Hen extends Bird {
    /*
    * Birds.Hen can neither run fast, fly, nor swim.
    * So only basic properties will be applied.
    * */

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
    public void displayProperties() {
        super.displayProperties();
        System.out.println("I'm a " + Hen.class.getSimpleName() + ", and...");
        walk();
        sleep();
        eat();
    }
}
