package org.demo.designpatterns.behavioral.strategy;

/**
 * @author teodora.bobirneci
 */
public class Animal {
    private String name;

    Flys flyingType;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    String tryToFly() {
        return flyingType.fly();
    }

    void setFlyingAbility(Flys newFlyType) {
        flyingType = newFlyType;
    }

}