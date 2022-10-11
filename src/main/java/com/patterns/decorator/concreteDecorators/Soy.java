package com.patterns.decorator.concreteDecorators;

import com.patterns.decorator.CondimentDecorator;
import com.patterns.decorator.Beverage;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" with "+"Soy";
    }
}
