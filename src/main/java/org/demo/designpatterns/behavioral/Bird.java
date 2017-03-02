package org.demo.designpatterns.behavioral;

/**
 * @author teodora.bobirneci
 */
class Bird extends Animal {

    Bird() {
        super();
        setSound("Tweet");
        flyingType = new ItFlys();
    }

}