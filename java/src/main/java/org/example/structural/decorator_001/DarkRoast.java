package org.example.structural.decorator_001;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        super("Dark Roast");
    }

    @Override
    public double cost() {
        return 300;
    }
}
