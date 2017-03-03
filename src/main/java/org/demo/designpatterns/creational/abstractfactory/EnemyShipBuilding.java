package org.demo.designpatterns.creational.abstractfactory;

/**
 * @author teodora.bobirneci
 */
abstract class EnemyShipBuilding {

    abstract EnemyShip makeEnemyShip(String typeOfShip);

    EnemyShip orderTheShip(String typeOfShip) {
        EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);

        theEnemyShip.makeShip();
        theEnemyShip.displayEnemyShip();
        theEnemyShip.followHeroShip();
        theEnemyShip.enemyShipShoots();

        return theEnemyShip;
    }
}