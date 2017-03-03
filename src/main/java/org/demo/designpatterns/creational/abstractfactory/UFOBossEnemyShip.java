package org.demo.designpatterns.creational.abstractfactory;

/**
 * @author teodora.bobirneci
 */
class UFOBossEnemyShip extends EnemyShip {

    EnemyShipFactory shipFactory;

    UFOBossEnemyShip(EnemyShipFactory shipFactory) {
        this.shipFactory = shipFactory;
    }

    void makeShip() {
        System.out.println("Making enemy ship " + getName());

        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();
    }

}