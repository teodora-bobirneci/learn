package org.demo.designpatterns.decorator;

/**
 * @author teodora.bobirneci
 */
public class SportsCar extends CarDecorator {

    SportsCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}