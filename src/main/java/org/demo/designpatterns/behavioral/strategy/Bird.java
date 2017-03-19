package org.demo.designpatterns.behavioral.strategy;

/**
 * @author teodora.bobirneci
 */
class Bird extends Animal {

    Bird() {
        super();
        flyingType = new ItFlys();
    }

}