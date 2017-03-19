package org.demo.designpatterns.decorator;

/**
 * @author teodora.bobirneci
 */
public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }

}