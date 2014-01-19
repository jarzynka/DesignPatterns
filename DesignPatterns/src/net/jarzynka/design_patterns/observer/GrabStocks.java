package net.jarzynka.design_patterns.observer;

public class GrabStocks {

	public static void main(String[] args) {
		
		// grab a new instance of the StockGrabber class which is our Subject (aka publisher)
		StockGrabber stockGrabber = new StockGrabber();
		
		// now pass that Stock Grabber object to instantiate an Observer class "StockObserver"
		// which will immediately add itself to stockGrabber's ArrayList of Observers
		// observer1 will subscribe itself to stockGrabbers notification list
		StockObserver observer1 = new StockObserver(stockGrabber);
				
		stockGrabber.setIbmPrice(197.00);
		stockGrabber.setAaplPrice(677.60);
		stockGrabber.setGoogPrice(676.40);
		
		// print a separator to the screen
		System.out.println("---------------------------");
		
		// observer2 will subscribe itself to the existing stockGrabber by adding itself 
		// to stockGrabber's ArrayList of "clients" aka Observers!
		StockObserver observer2 = new StockObserver(stockGrabber);
		stockGrabber.setIbmPrice(184.25);
		stockGrabber.setAaplPrice(800.00);
		stockGrabber.setGoogPrice(707.50);
		
		// print another separator to the screen
		System.out.println("---------------------------");
		
		// note that the updates notify BOTH the new observer2 and the old observer1!
		// also note that the two observer classes have no knowledge of each other only
		// the Subject (provider, publisher) object.
		
		// Now let's say that observer1 is "sick" of getting stock updates
		// we can unsubscribe it here by...
		
		stockGrabber.unregister(observer1); // now observer1 will no longer get notified on changes to update()
		

		
		// now we'll only see observer2 respond to any stock price changes/update()s
		
		stockGrabber.setIbmPrice(32.25);
		stockGrabber.setAaplPrice(1100.00);
		stockGrabber.setGoogPrice(950.50);
		
		
		

	}

}
