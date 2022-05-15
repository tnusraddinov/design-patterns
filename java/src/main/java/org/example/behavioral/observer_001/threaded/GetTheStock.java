package org.example.behavioral.observer_001.threaded;

import java.text.DecimalFormat;
import java.util.stream.IntStream;
import org.example.behavioral.observer_001.StockGrabber;
import org.example.behavioral.observer_001.Subject;

public class GetTheStock implements Runnable {

    private int startTime;
    private String stock;
    private double price;
    private Subject stockGrabber;

    public GetTheStock(Subject stockGrabber, int startTime, String stock, double price) {
        this.stockGrabber = stockGrabber;
        this.startTime = startTime;
        this.stock = stock;
        this.price = price;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            simulate();
        }
    }

    private void simulate() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        double randNum = (Math.random() * (.06)) - .03;

        DecimalFormat df = new DecimalFormat("#.##");
        price = Double.valueOf(df.format(price + randNum));

        if ("IBM".equals(stock)) {
            ((StockGrabber) stockGrabber).setIbmPrice(price);
        }
        if ("AAPL".equals(stock)) {
            ((StockGrabber) stockGrabber).setAaplPrice(price);
        }
        if ("GOOG".equals(stock)) {
            ((StockGrabber) stockGrabber).setGoogPrice(price);
        }
        System.out.println(stock + ": " + df.format(price + randNum) + " " + randNum);
        System.out.println();
    }
}
