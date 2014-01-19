package net.jarzynka.design_patterns.observer;

public class StockObserver implements Observer {

	// set fields for stock prices
	private double ibmPrice, aaplPrice, googPrice;
	
	// a static member is used here since we'll track the total number of created Observers
	// these values won't be specific to a particular instance
	private static int observerIdTracker = 0;
	
	// a field that tracks observer ID - this *is* an instance variable
	private int observerId;
	
	// a field that stores an instance of the StockGrabber (publisher) class
	private Subject stockGrabber;
	
	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		
		// we must implement this method per our Interface requirements
		// get the stock prices from input and print them to the screen
		// using the printThePrices() method
		
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		
		printThePrices();

	}
	
	// a method that will print the Object's stock prices to stdout
	public void printThePrices()
	{
		System.out.println(observerId);
		System.out.println("IBM: "+ibmPrice);
		System.out.println("AAPL: " + aaplPrice);
		System.out.println("GOOG: " + googPrice);
	}
	
	
	// constructor
	public StockObserver(Subject stockGrabber)
	{
		// grab an instance of the Subject/Publisher class
		this.stockGrabber = stockGrabber;
		// Assign an ID to the ID instance variable while incrementing the class ID variable
		this.observerId = ++observerIdTracker;
		
		// print out a convenience message with Observer ID
		System.out.println("New Observer "+this.observerId);
		
		// now use our instantiated Subject/Publisher class reference to add this Object to its ArrayList of subscribers
		stockGrabber.register(this);
		
	}

}
