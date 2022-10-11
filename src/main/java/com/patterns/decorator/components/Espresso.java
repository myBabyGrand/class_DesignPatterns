package com.patterns.decorator.components;

import com.patterns.decorator.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }
    public double cost() {
        return 0.50;
    }
}
