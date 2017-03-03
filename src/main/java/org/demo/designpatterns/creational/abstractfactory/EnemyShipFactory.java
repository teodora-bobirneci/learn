package org.demo.designpatterns.creational.abstractfactory;

/**
 * @author teodora.bobirneci
 */
interface EnemyShipFactory {

    ESWeapon addESGun();

    ESEngine addESEngine();

}