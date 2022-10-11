package com.patterns.strategy.concrete;

import com.patterns.strategy.strategy.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I’m Flying!!");
    }
}
