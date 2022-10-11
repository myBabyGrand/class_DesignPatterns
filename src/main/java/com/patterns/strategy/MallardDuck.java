package com.patterns.strategy;

import com.patterns.strategy.concrete.FlyWithWings;
import com.patterns.strategy.concrete.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("I’m a real Mallard Duck");
    }
}
