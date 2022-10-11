package com.patterns.adapter;

import com.patterns.adapter.targetInterface.Turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("WildTurkey can fly short distance");
    }
}
