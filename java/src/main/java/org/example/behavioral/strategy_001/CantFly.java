package org.example.behavioral.strategy_001;

public class CantFly implements Flys{

    @Override
    public void fly() {
        System.out.println(" cannot fly");

    }
}
