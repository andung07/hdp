package strategy;

public class MallardDuck extends Duck {
    public MallardDuck(QuackBehavior qb) {
        super(qb);
    }

    @Override
    public void display() {
        System.out.println("Mallard duck display");
    }
}
