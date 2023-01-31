public class RedheadDuck extends Duck implements Flyable,Quackable {
    @Override
    public void swim() {
        super.swim();
    }

    public void display() {
        System.out.println("Hello. I.m RedheadDuck");
    }


    public void quack() {
        System.out.println("Redhead duck can quack");
    }

    @Override
    public void fly() {
        System.out.println("Redhead duck can fly");
    }
}
