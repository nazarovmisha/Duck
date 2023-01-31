public class RubberDuck extends Duck implements Quackable {

    @Override
    public void quack() {
        System.out.println("the rubber duck squeaks");
    }

    @Override
    public void swim() {
        super.swim();
    }

    @Override
    public void display() {
        System.out.println("Hello. I'm rubberDuck");
    }
}
