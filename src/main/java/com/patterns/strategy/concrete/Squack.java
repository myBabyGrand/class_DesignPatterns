package com.patterns.strategy.concrete;

import com.patterns.strategy.strategy.QuackBehavior;

public class Squack implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
