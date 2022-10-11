package com.patterns.decorator.concreteDecorators;

import com.patterns.decorator.CondimentDecorator;
import com.patterns.decorator.Beverage;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" with "+"Mocha";
    }
}
