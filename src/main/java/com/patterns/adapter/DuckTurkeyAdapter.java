package com.patterns.adapter;

import com.patterns.adapter.adapteeInterface.Duck;
import com.patterns.adapter.targetInterface.Turkey;

public class DuckTurkeyAdapter implements Duck {
    Turkey turkey;
    public DuckTurkeyAdapter (Turkey turkey) {
        this.turkey = turkey;
    }
    public void quack () {
        turkey.gobble ();
    }
    public void fly () {
        for (int i= 0; i < 5; i++)
            turkey.fly ();
    }
}