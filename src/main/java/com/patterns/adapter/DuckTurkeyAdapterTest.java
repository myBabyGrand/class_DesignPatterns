package com.patterns.adapter;

import com.patterns.adapter.adapteeInterface.Duck;

public class DuckTurkeyAdapterTest {
    public static void main(String[] args) {
        WildDuck duck = new WildDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new DuckTurkeyAdapter(turkey);
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();
        System.out.println("\nThe Duck says...");
        testDuck(duck);
        System.out.println("\nThe DuckTurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
