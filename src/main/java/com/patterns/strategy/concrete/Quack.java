package com.patterns.strategy.concrete;

import com.patterns.strategy.strategy.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
