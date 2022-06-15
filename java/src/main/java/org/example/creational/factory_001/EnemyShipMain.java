package org.example.creational.factory_001;

import java.util.Scanner;

public class EnemyShipMain {

    public static void main(String[] args) {
        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
        EnemyShip enemy;

        Scanner userInput = new Scanner(System.in);
        String enemyShootOption = "";
        System.out.println("What type of ship? (U/R/B)");

        if (userInput.hasNext()) {
            enemyShootOption = userInput.nextLine();
            enemy = enemyShipFactory.makeEnemyShip(enemyShootOption);
            doStuffEnemy(enemy);
        }


    }

    private static void doStuffEnemy(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
