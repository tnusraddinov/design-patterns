package org.example.structural.decorator;

public abstract class Beverage {
    private final String description;

    public Beverage(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
