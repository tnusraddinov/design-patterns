package org.example.behavioral.observer_001;

import org.example.behavioral.observer_001.threaded.GetTheStock;

public class ObserverDemoMain {

    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(200.4);
        stockGrabber.setAaplPrice(300.5);
        stockGrabber.setGoogPrice(500.5);

        StockObserver observer2 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(200.4);
        stockGrabber.setAaplPrice(300.5);
        stockGrabber.setGoogPrice(500.5);

        stockGrabber.unregister(observer1);
        stockGrabber.setIbmPrice(200.4);
        stockGrabber.setAaplPrice(300.5);
        stockGrabber.setGoogPrice(500.5);

        GetTheStock getIbm = new GetTheStock(stockGrabber, 2, "IBM", 200.04);
        GetTheStock getAapl = new GetTheStock(stockGrabber, 2, "AAPL", 300.04);
        GetTheStock getGoog = new GetTheStock(stockGrabber, 2, "GOOG", 400.04);

        new Thread(getIbm).start();
        new Thread(getAapl).start();
        new Thread(getGoog).start();

    }

}
