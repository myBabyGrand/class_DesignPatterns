package com.patterns.strategy;

import com.patterns.strategy.concrete.FlyRocketPowered;
import org.junit.jupiter.api.Test;


class DuckTest {

    @Test
    void mallardDuckTest(){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }

    @Test
    void someDuckTest(){
        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }

}