package com.patterns.state;

public class GumballMachineTest {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(11);
        while(gumballMachine.getCount()>0){
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            System.out.println("=======");
            System.out.println("now "+gumballMachine.getCount()+" gumballs remain");
            System.out.println();
        }
    }
}
