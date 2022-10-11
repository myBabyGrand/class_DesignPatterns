package com.patterns.factory.abstractFactory;

import com.patterns.factory.abstractFactory.concreteFactory.NYPizzaStore;

public class PizzaWithIngredientTest {
    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza cheesePizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ordered Pizza is : " + cheesePizza.getName());

    }
}
