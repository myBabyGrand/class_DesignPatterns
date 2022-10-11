package com.patterns.strategy;

import com.patterns.strategy.strategy.QuackBehavior;
import com.patterns.strategy.strategy.FlyBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;//object composition
    QuackBehavior quackBehavior;//object composition

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();//delegation
    }

    public void performQuack() {
        quackBehavior.quack();//delegation
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}

