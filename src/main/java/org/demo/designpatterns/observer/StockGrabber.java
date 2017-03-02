package org.demo.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author teodora.bobirneci
 */
public class StockGrabber implements Subject {

    private List<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    StockGrabber() {
        observers = new ArrayList<>();
    }

    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex + 1) + " deleted");
        observers.remove(observerIndex);
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    void setIBMPrice(double newIBMPrice) {
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }

    void setAAPLPrice(double newAAPLPrice) {
        this.aaplPrice = newAAPLPrice;
        notifyObserver();
    }

    void setGOOGPrice(double newGOOGPrice) {
        this.googPrice = newGOOGPrice;
        notifyObserver();
    }

}