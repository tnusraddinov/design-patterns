package org.example.creational.factory_001;

import java.util.Scanner;

public class EnemyShipMain {

    public static void main(String[] args) {
        EnemyShip enemy;

        Scanner userInput = new Scanner(System.in);
        String enemyShootOption = "";
        System.out.println("What type of ship? (U/R)");

        if (userInput.hasNext()){
            enemyShootOption = userInput.nextLine();
        }

        if ("U".equals(enemyShootOption)){
            enemy = new UFOEnemyShip();
        } else {
            enemy = new RocketEnemyShip();
        }
        doStuffEnemy(enemy);
    }

    private static void doStuffEnemy(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
