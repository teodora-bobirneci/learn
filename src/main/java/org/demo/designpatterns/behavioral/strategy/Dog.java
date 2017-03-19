package org.demo.designpatterns.behavioral.strategy;

/**
 * @author teodora.bobirneci
 */
class Dog extends Animal {

    Dog() {
        super();
        flyingType = new CantFly();
    }

}