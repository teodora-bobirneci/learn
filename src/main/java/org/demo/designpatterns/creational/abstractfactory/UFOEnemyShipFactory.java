package org.demo.designpatterns.creational.abstractfactory;

/**
 * @author teodora.bobirneci
 */
class UFOEnemyShipFactory implements EnemyShipFactory {

    public ESWeapon addESGun() {
        return new ESUFOGun();
    }

    public ESEngine addESEngine() {
        return new ESUFOEngine();
    }
}