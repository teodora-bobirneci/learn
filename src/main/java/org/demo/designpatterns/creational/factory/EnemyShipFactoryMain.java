package org.demo.designpatterns.creational.factory;

import java.util.Scanner;

/**
 * @author teodora.bobirneci
 */
public class EnemyShipFactoryMain {

    public static void main(String[] args) {
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        Scanner userInput = new Scanner(System.in);
        EnemyShip theEnemy;

        System.out.print("What type of ship? (U / R / B)");

        if (userInput.hasNextLine()) {
            String typeOfShip = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);

            if (theEnemy != null) {
                doStuffEnemy(theEnemy);
            } else {
                System.out.print("Please enter U, R, or B next time.");
            }
        }
    }

    private static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }

}
