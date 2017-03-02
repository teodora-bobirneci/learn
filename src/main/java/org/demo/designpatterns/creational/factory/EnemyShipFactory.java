package org.demo.designpatterns.creational.factory;

/**
 * @author teodora.bobirneci
 */
class EnemyShipFactory {

    EnemyShip makeEnemyShip(String newShipType) {
        switch (newShipType) {
            case "U":
                return new UFOEnemyShip();
            case "R":
                return new RocketEnemyShip();
            case "B":
                return new BigUFOEnemyShip();
            default:
                return null;
        }
    }

}