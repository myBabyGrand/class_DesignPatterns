package com.patterns.templateMethod;

import java.io.IOException;

public abstract class CaffeineBeverage {
    //skeleton, 하위 클래스에서 수정불가
    //template method
    public final void prepareRecipe() throws IOException {
        boilWater();
        brew();
        pourInCup();
//        addCondiments();
        if (customerWantsCondiments()) addCondiments();
    }

    public boolean customerWantsCondiments() throws IOException {
        return false;
    }

    public abstract void brew();
    public abstract void addCondiments();
    public void boilWater() {
        System.out.println("Boiling water");
    }
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
