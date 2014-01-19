package net.jarzynka.design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

// this is a class that implements our subject (publisher) interface

public class StockGrabber implements Subject {

	// We will store all of our Observers (subscribers) in an ArrayList
	private List<Observer> observers;
	// We will also have a representation for the stick prices defined in the Observer Interface
	private double ibmPrice, aaplPrice, googPrice;
	
	@Override
	public void register(Observer newObserver) {
		// add the new Observer object to the ArrayList
		observers.add(newObserver);
		
	}

	@Override
	public void unregister(Observer deleteObserver) {
		// get the index in our ArrayList of the passed "deleteObserver" object		
		int observerIndex = observers.indexOf(deleteObserver);
		// use this index information to delete the observer from our ArrayList
		observers.remove(observerIndex);
		// print a message confirming deletion
		System.out.println("Observer# " + (observerIndex + 1) + " deleted.");
	}

	@Override
	public void notifyObserver() {
		// iterate over the ArrayList and call the Observer's Update method for each Observer in our list
		for (Observer observer : observers)
		{
			// call the update method on each Observer (client subscriber) object
			observer.update(ibmPrice, aaplPrice, googPrice);
			
		}

	}
	
	// mutator methods for setting/changing stock prices
	public void setIbmPrice (double ibmPrice)
	{
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}
	
	public void setAaplPrice (double aaplPrice)
	{
		this.aaplPrice = aaplPrice;
		notifyObserver();
	}
	
	public void setGoogPrice (double googPrice)
	{
		this.googPrice = googPrice;
		notifyObserver();
	}
	
	// constructor
	public StockGrabber()
	{
		
		observers = new ArrayList<Observer>();
	}

}
