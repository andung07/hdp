package com.enigma;

import strategy.QuackTwice;

public class Strategy {

    public static void main(String[] args) {
        strategy.MallardDuck mallardDuck = new strategy.MallardDuck(new strategy.QuackOnce());
        mallardDuck.quack();
        mallardDuck.display();

        QuackTwice qt = new QuackTwice();
        mallardDuck.setQuackBehavior(qt);
        mallardDuck.quack();
        mallardDuck.display();
    }
}
