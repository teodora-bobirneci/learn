package org.demo.designpatterns.behavioral;

/**
 * @author teodora.bobirneci
 */
class Dog extends Animal {

    Dog() {
        super();
        flyingType = new CantFly();
    }

}