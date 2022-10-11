package com.patterns.state;

public interface State {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;
    public void insertQuarter() ;
    public void ejectQuarter() ;
    public void turnCrank() ;
    public void dispense() ;
}
