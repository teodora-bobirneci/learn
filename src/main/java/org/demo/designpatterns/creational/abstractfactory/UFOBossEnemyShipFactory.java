package org.demo.designpatterns.creational.abstractfactory;

/**
 * @author teodora.bobirneci
 */
public class UFOBossEnemyShipFactory implements EnemyShipFactory {

    public ESWeapon addESGun() {
        return new ESUFOBossGun();
    }

    public ESEngine addESEngine() {
        return new ESUFOBossEngine();
    }

}