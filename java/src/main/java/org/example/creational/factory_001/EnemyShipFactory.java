package org.example.creational.factory_001;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String shipType) {
        if ("U".equals(shipType)) {
            return new UFOEnemyShip();
        } else if ("R".equals(shipType)) {
            return new RocketEnemyShip();
        } else if ("B".equals(shipType)) {
            return new BigUFOEnemyShip();
        } else {
            return null;
        }
    }

}
