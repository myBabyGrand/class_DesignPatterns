package com.patterns.strategy.concrete;

import com.patterns.strategy.strategy.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!!");
    }
}
