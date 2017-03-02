package org.demo.designpatterns.observer;

/**
 * @author teodora.bobirneci
 */
public class GrabStocksMain {

    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        new StockObserver(stockGrabber);
        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.60);
        stockGrabber.setGOOGPrice(676.40);

        StockObserver observer2 = new StockObserver(stockGrabber);
        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.60);
        stockGrabber.setGOOGPrice(676.40);

        stockGrabber.unregister(observer2);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.60);
        stockGrabber.setGOOGPrice(676.40);

        Runnable getIBM = new GetTheStock(stockGrabber, "IBM", 197.00);
        Runnable getAAPL = new GetTheStock(stockGrabber, "AAPL", 677.60);
        Runnable getGOOG = new GetTheStock(stockGrabber, "GOOG", 676.40);

        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();
    }

}