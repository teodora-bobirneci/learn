package org.demo.designpatterns.creational.abstractfactory;

/**
 * @author teodora.bobirneci
 */
abstract class EnemyShip {
    private String name;

    ESWeapon weapon;
    ESEngine engine;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    abstract void makeShip();

    void followHeroShip() {
        System.out.println(getName() + " is following the hero at " + engine);
    }

    void displayEnemyShip() {
        System.out.println(getName() + " is on the screen");
    }

    void enemyShipShoots() {
        System.out.println(getName() + " attacks and does " + weapon);
    }

    public String toString() {
        return "The " + name + " has a top speed of " + engine + " and an attack power of " + weapon;
    }

}