package org.example.behavioral.observer_001;

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

    }

}
