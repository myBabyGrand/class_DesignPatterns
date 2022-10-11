package com.patterns.strategy.concrete;

import com.patterns.strategy.strategy.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can’t fly");
    }
}
