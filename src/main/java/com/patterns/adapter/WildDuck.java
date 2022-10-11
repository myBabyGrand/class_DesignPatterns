package com.patterns.adapter;

import com.patterns.adapter.adapteeInterface.Duck;

public class WildDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("quack quack");
    }

    @Override
    public void fly() {
        System.out.println("WildDuck can fly long distance");
    }
}
