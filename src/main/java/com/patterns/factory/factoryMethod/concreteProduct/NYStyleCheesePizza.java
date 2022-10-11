package com.patterns.factory.factoryMethod.concreteProduct;

import com.patterns.factory.factoryMethod.Pizza;

public class NYStyleCheesePizza  extends Pizza {
    public NYStyleCheesePizza(){
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}