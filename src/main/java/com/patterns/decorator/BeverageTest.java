package com.patterns.decorator;

import com.patterns.decorator.Beverage;
import com.patterns.decorator.components.DarkRoast;
import com.patterns.decorator.components.Espresso;
import com.patterns.decorator.components.HouseBlend;
import com.patterns.decorator.concreteDecorators.Mocha;
import com.patterns.decorator.concreteDecorators.Soy;
import com.patterns.decorator.concreteDecorators.Whip;

public class BeverageTest {
    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }

}
