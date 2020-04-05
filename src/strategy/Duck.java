package strategy;

public class Duck {
    private QuackBehavior qb;

    public Duck(QuackBehavior qb) {
        this.setQuackBehavior(qb);
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.qb = qb;
    }

    public void quack() {
        this.qb.doQuack();
    }

    public void display() {
        System.out.println("Basic duck display");
    }
}

