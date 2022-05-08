package org.example.behavioral.strategy_001;

public class Bird extends Animal{

    public Bird(String name) {
        this.setName(name);
        this.setFlyType(new CanFly());
    }
}
