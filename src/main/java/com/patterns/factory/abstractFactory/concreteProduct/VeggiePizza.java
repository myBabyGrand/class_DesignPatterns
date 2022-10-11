package com.patterns.factory.abstractFactory.concreteProduct;

import com.patterns.factory.abstractFactory.Pizza;
import com.patterns.factory.abstractFactory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {

    }
}
