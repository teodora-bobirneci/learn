package org.demo.designpatterns.creational.abstractfactory;

/**
 * @author teodora.bobirneci
 */
class UFOEnemyShip extends EnemyShip {

    EnemyShipFactory shipFactory;

    UFOEnemyShip(EnemyShipFactory shipFactory) {
        this.shipFactory = shipFactory;
    }

    void makeShip() {
        System.out.println("Making enemy ship " + getName());

        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();
    }

}