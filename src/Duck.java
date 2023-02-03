public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void performQuack(){
        quackBehavior.quack();
    }
    public  void performFly(){
        flyBehavior.fly();
    }
    public void swim(){
        System.out.println("All ducks can swim");
    }
    public void display(){
    }
}
