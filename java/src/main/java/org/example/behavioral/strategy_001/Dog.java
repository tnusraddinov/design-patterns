package org.example.behavioral.strategy_001;

public class Dog extends Animal{

    public Dog(String name) {
        this.setName(name);
        this.setFlyType(new CantFly());
    }
}
