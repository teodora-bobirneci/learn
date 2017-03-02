package org.demo.designpatterns.observer;

import java.text.DecimalFormat;

/**
 * @author teodora.bobirneci
 */
public class GetTheStock implements Runnable {
    private String stock;
    private double price;

    private Subject stockGrabber;

    GetTheStock(Subject stockGrabber, String newStock, double newPrice) {
        this.stockGrabber = stockGrabber;

        stock = newStock;
        price = newPrice;
    }

    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ignored) {
            }

            double randNum = (Math.random() * (.06)) - .03;
            DecimalFormat df = new DecimalFormat("#.##");

            price = Double.valueOf(df.format((price + randNum)));

            if (stock.equalsIgnoreCase("IBM")) {
                ((StockGrabber) stockGrabber).setIBMPrice(price);
            }
            if (stock.equalsIgnoreCase("AAPL")) {
                ((StockGrabber) stockGrabber).setAAPLPrice(price);
            }
            if (stock.equalsIgnoreCase("GOOG")) {
                ((StockGrabber) stockGrabber).setGOOGPrice(price);
            }

            System.out.println(stock + ": " + df.format((price + randNum)) + " " + df.format(randNum) + "\n");
        }
    }

}