package org.demo.designpatterns.decorator;

/**
 * @author teodora.bobirneci
 */
public class CarDecorator implements Car {

    private Car car;

    CarDecorator(Car c) {
        this.car = c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }

}