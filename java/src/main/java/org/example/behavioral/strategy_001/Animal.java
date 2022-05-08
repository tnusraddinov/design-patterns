package org.example.behavioral.strategy_001;

public class Animal {
    private String name;
    private Flys flyType;

    public void setName(String name) {
        this.name = name;
    }

    public void setFlyType(Flys flyType) {
        this.flyType = flyType;
    }

    public String getName() {
        return name;
    }

    public void tryToFly(){
        System.out.println("=".repeat(10));
        System.out.println(getName());
        flyType.fly();
    }
}
