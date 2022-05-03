package org.example.structural.decorator;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        super("Dark Roast");
    }

    @Override
    public double cost() {
        return 300;
    }
}
