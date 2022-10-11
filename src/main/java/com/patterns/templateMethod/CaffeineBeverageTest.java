package com.patterns.templateMethod;

import com.patterns.templateMethod.concreteClass.Coffee;
import com.patterns.templateMethod.concreteClass.Tea;

import java.io.IOException;

public class CaffeineBeverageTest {
    public static void main(String[] args) throws IOException {
        Tea tea = new Tea();
        tea.prepareRecipe();
        System.out.println("====");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

    }
}
