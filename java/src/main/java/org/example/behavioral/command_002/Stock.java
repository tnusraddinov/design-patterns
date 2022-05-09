package org.example.behavioral.command_002;

public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Name: " + name + ", quantity: " + quantity + " bought");
    }

    public void sell(){
        System.out.println("Name: " + name + ", quantity: " + quantity + " sold");
    }

}
