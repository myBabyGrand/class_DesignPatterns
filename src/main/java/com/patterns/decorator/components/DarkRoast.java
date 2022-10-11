package com.patterns.decorator.components;

import com.patterns.decorator.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 2.00;
    }
}
