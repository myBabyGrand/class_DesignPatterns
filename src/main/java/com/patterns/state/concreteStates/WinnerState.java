package com.patterns.state.concreteStates;

import com.patterns.state.GumballMachine;
import com.patterns.state.State;

public class  WinnerState implements State {
    GumballMachine gumballMachine;
    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a Gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("[ejectQuarter] winner state");
    }

    @Override
    public void turnCrank() {
        System.out.println("[turnCrank] winner state");

    }

    public void dispense() {
        System.out.println("YOU'RE A WINNER! You get two gumballs!");
        gumballMachine.releaseBall();
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0)
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        else
            gumballMachine.setState(gumballMachine.getSoldOutState());
    }
}