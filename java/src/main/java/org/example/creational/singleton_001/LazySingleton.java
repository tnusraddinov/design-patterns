package org.example.creational.singleton_001;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    @Override
    public String toString() {
        return LazySingleton.class.getSimpleName();
    }
}
