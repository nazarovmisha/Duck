public class MallardDuck extends Duck  {


    public MallardDuck() {
        quackBehavior = new Quack();
    }

    @Override
    public void swim() {
        super.swim();
    }

    public void display() {
        System.out.println("Hello, I'm MallardDuck");
    }


}
