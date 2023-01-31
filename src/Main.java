public class Main {
    public static void main(String[] args) {
        Duck m = new Duck();
        m.quack();
        m.display();
        m.swim();
        m.fly();
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        RedheadDuck redheadDuck=new RedheadDuck();
        redheadDuck.display();
    }
}
