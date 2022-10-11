package com.patterns.iterator;

import com.patterns.iterator.concreteAggregate.DinerMenu;
import com.patterns.iterator.concreteAggregate.PancakeHouseMenu;
import org.junit.jupiter.api.Test;


class WaitressTest {


    @Test
    void printMenuTest(){
        Waitress waitress = new Waitress(new PancakeHouseMenu(), new DinerMenu());
        waitress.printMenu();
    }

}