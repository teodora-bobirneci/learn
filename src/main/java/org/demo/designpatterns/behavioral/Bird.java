package org.demo.designpatterns.behavioral;

/**
 * @author teodora.bobirneci
 */
class Bird extends Animal {

    Bird() {
        super();
        flyingType = new ItFlys();
    }

}