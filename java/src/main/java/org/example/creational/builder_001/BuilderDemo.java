package org.example.creational.builder_001;

public class BuilderDemo {

    public static void main(String[] args) {

        Computer computer = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();
    }

}
