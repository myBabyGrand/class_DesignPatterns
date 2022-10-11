package com.patterns.factory.factoryMethod.concreteCreator;

import com.patterns.factory.factoryMethod.concreteProduct.ChicagoStyleCheesePizza;
import com.patterns.factory.factoryMethod.concreteProduct.ChicagoStyleVeggiePizza;
import com.patterns.factory.factoryMethod.Pizza;
import com.patterns.factory.factoryMethod.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
