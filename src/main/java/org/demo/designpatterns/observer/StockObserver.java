package org.demo.designpatterns.observer;

/**
 * @author teodora.bobirneci
 */
public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIDTracker = 0;
    private int observerID;

    StockObserver(Subject stockGrabber) {
        this.observerID = ++observerIDTracker;

        System.out.println("New Observer " + this.observerID);
        stockGrabber.register(this);
    }

    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printThePrices();
    }

    private void printThePrices() {
        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " + aaplPrice + "\nGOOG: " + googPrice + "\n");
    }

}