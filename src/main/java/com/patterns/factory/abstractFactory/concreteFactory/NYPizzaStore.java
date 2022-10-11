package com.patterns.factory.abstractFactory.concreteFactory;

import com.patterns.factory.abstractFactory.Pizza;
import com.patterns.factory.abstractFactory.PizzaIngredientFactory;
import com.patterns.factory.abstractFactory.PizzaStore;
import com.patterns.factory.abstractFactory.concreteProduct.CheesePizza;
import com.patterns.factory.abstractFactory.concreteProduct.ClamPizza;
import com.patterns.factory.abstractFactory.concreteProduct.PepperoniPizza;
import com.patterns.factory.abstractFactory.concreteProduct.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
