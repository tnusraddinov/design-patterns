package org.example.behavioral.observer_001;

public class StockObserver implements Observer{

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIdTracker = 0;
    private int observerId;
    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerId = ++observerIdTracker;
        stockGrabber.register(this);
        System.out.println("New observer " + observerId);
    }


    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        System.out.println("Observer " + observerId +"\nIBM "+ibmPrice + "\naapl " + aaplPrice + "\ngoog " + googPrice);
        System.out.println("");
    }
}
