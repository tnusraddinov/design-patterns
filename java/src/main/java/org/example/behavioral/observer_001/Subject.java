package org.example.behavioral.observer_001;

public interface Subject {

    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObserver();

}
