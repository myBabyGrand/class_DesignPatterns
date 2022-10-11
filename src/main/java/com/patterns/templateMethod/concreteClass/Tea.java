package com.patterns.templateMethod.concreteClass;

import com.patterns.templateMethod.CaffeineBeverage;

public class Tea extends CaffeineBeverage {
    public void brew() {
        System.out.println("Steeping the tea");
    }
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
