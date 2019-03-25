import java.util.ArrayList;

// Uses the subject interface to update all Observers

public class StockGrabber implements Subject {
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber() {
        // Constructor. Creates an ArrayList to hold all observers
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer o) {
        // Adds a new observer to the ArrayList
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        // Get the index of the observer to delete
        int observerIndex = observers.indexOf(o);

        // Print out message (Have to increment index to match)
        System.out.println("Observer " + (observerIndex+1) + " deleted");

        // Removes observer from the ArrayList
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        // Cycle through all observers and notifies them of price changes

        for (Observer observer : observers) {
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    // Change prices for all stocks and notifies observers of changes

    public void setIBMPrice(double newIBMPrice) {
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }


    public void setAAPLPrice(double newAPPLPrice) {
        this.aaplPrice = newAPPLPrice;
        notifyObserver();
    }

    public void setGOOGPrice(double newGOOGPrice) {
        this.googPrice = newGOOGPrice;
        notifyObserver();
    }

}
