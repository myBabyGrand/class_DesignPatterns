package com.patterns.state.concreteStates;

import com.patterns.state.GumballMachine;
import com.patterns.state.State;

public class SoldOutState implements State {
    GumballMachine gumballMachine;
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("[insertQuarter]sold out!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("[ejectQuarter]sold out!");
    }

    @Override
    public void turnCrank() {
        System.out.println("[turnCrank]sold out!");
    }

    @Override
    public void dispense() {
        System.out.println("[dispense]sold out!");
    }
}
