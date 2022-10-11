package com.patterns.strategy.concrete;

import com.patterns.strategy.strategy.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< silence >>");
    }
}
