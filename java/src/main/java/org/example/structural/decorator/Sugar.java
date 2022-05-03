package org.example.structural.decorator;

public class Sugar extends AddOn{
    public Sugar(Beverage beverage) {
        super("Sugar", beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 50;
    }
}
