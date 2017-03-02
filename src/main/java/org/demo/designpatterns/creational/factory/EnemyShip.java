package org.demo.designpatterns.creational.factory;

/**
 * @author teodora.bobirneci
 */
public class EnemyShip {
    private String name;
    private double amtDamage;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    void setDamage(double newDamage) {
        amtDamage = newDamage;
    }

    void followHeroShip() {
        System.out.println(name + " is following the hero");
    }

    void displayEnemyShip() {
        System.out.println(name + " is on the screen");
    }

    void enemyShipShoots() {
        System.out.println(name + " attacks and does " + amtDamage + " damage to hero");
    }

}