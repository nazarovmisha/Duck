public class MallardDuck extends Duck implements Flyable, Quackable{
    @Override
    public void fly() {
        System.out.println("Mallard duck can fly");
    }

    @Override
    public void swim() {
        super.swim();
    }

    public void display() {
        System.out.println("Hello, I'm MallardDuck");
    }

    @Override
    public void quack() {
        System.out.println("Mallard duck quack");
    }
}
