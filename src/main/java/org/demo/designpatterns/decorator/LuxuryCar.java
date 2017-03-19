package org.demo.designpatterns.decorator;

/**
 * @author teodora.bobirneci
 */
public class LuxuryCar extends CarDecorator {

    LuxuryCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}