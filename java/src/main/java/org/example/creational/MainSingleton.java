package org.example.creational;

import org.example.creational.singleton.EagerSingleton;
import org.example.creational.singleton.LazySingleton;
import org.example.creational.singleton.ThreadSafeSingleton;

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