package com.patterns.factory.abstractFactory.concreteProduct;

import com.patterns.factory.abstractFactory.Pizza;
import com.patterns.factory.abstractFactory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {

    }
}
