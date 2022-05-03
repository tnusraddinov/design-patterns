package org.example.structural;

import org.example.structural.decorator.HouseBlend;
import org.example.structural.decorator.Milk;
import org.example.structural.decorator.Sugar;

public class MainDecorator {
    public static void main(String[] args) {
        System.out.println("Decorator:");

        HouseBlend houseBlend = new HouseBlend();
        System.out.println(houseBlend.getDescription() + ": " + houseBlend.cost());

        Milk milkAddOn = new Milk(houseBlend);
        System.out.println(milkAddOn.getDescription() + ": " + milkAddOn.cost());

        Sugar sugarAddOn = new Sugar(milkAddOn);
        System.out.println(sugarAddOn.getDescription() + ": " + sugarAddOn.cost());

    }
}