package org.example.creational.singleton;

public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return EagerSingleton.class.getSimpleName();
    }
}
