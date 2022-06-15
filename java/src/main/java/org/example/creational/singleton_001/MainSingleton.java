package org.example.creational.singleton_001;

public class MainSingleton {
    public static void main(String[] args) {
        System.out.println("Singleton:");

        EagerSingleton eagerInstance = EagerSingleton.getInstance();
        System.out.println(eagerInstance == EagerSingleton.getInstance());

        LazySingleton lazyInstance = LazySingleton.getInstance();
        System.out.println(lazyInstance == LazySingleton.getInstance());

        ThreadSafeSingleton threadSafeInstance = ThreadSafeSingleton.getInstance();
        System.out.println(threadSafeInstance == ThreadSafeSingleton.getInstance());

    }
}