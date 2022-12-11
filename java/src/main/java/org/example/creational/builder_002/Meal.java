package org.example.creational.builder_002;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private final List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        return items.stream()
                .map(Item::price)
                .reduce(Float::sum)
                .orElse(cost);
    }

    public void showItems() {

        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
