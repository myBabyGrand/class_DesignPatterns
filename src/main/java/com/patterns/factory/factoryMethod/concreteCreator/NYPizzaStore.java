package com.patterns.factory.factoryMethod.concreteCreator;

import com.patterns.factory.factoryMethod.concreteProduct.NYStyleVeggiePizza;
import com.patterns.factory.factoryMethod.concreteProduct.NYStyleCheesePizza;
import com.patterns.factory.factoryMethod.Pizza;
import com.patterns.factory.factoryMethod.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else  {
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
