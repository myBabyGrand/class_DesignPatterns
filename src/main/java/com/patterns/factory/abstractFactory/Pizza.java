package com.patterns.factory.abstractFactory;

import com.patterns.factory.abstractFactory.concreteProduct.ingredients.Cheese;
import com.patterns.factory.abstractFactory.concreteProduct.ingredients.Dough;
import com.patterns.factory.abstractFactory.concreteProduct.ingredients.Sauce;
import com.patterns.factory.abstractFactory.concreteProduct.ingredients.Veggies;

public abstract class Pizza {
    public String name;
    public Dough dough;
    public Sauce sauce;
    public Veggies veggies[];
    public Cheese cheese;
    abstract public void prepare();
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return this.getName();
    }
}