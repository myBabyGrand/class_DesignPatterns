package com.patterns.factory.factoryMethod;

import com.patterns.factory.factoryMethod.concreteCreator.ChicagoPizzaStore;
import com.patterns.factory.factoryMethod.concreteCreator.NYPizzaStore;

public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza nyPizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + nyPizza.getName());
        Pizza chicagoPizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + chicagoPizza.getName());
    }
}
