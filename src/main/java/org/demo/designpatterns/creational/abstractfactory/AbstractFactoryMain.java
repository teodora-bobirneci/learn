package org.demo.designpatterns.creational.abstractfactory;

/**
 * @author teodora.bobirneci
 */
public class AbstractFactoryMain {

    public static void main(String[] args) {
        EnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding();

        EnemyShip theGrunt = MakeUFOs.orderTheShip("UFO");
        System.out.println(theGrunt + "\n");

        EnemyShip theBoss = MakeUFOs.orderTheShip("UFO BOSS");
        System.out.println(theBoss + "\n");

    }

}
