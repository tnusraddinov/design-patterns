package org.example.behavioral.strategy_001;

public class MainDemo {

    public static void main(String[] args) {
        Animal dog1 = new Dog("dog 1");
        Animal bird1 = new Bird("bird 1");

        dog1.tryToFly();
        bird1.tryToFly();
    }

}
