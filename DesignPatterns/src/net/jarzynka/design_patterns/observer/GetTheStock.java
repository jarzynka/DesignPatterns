package net.jarzynka.design_patterns.observer;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.spi.DecimalFormatSymbolsProvider;
import java.util.Locale;

/*
 * we're attempting to build a Threaded class that grabs stock price changes
 * we're implementing the Runnable Interface right in our class so that we
 * may be able to entend a parent class in the future.
 */
public class GetTheStock implements Runnable {

	
	// fields
	
	private int startTime; // thread should be updated based on a start time
	private String stock; // an individual stock's name
	private double price; // an individual stock's price
	
	private Subject stockGrabber; // a place to store the StockGrabber Object (our publisher)  using its base Interface
	
	
	@Override
	public void run() {
		// Simulate a stock data fetch by iterating through this process 20 times.
		for (int i=1; i<=20; i++)
		{
			try
			{
				// put an artificial pause to simulate grabbing value from remote database
				// pause time based on entered startTime value from constructor
				Thread.sleep(startTime * 1000);
			}
			catch (InterruptedException ex)
			{
				// just put a generic error messsage to stdout for this example
				System.out.println("There was an error!\n"+ex.toString());
			}
			
			
			// for this example, we're going to generate a random number
			// between -0.03 and +0.03 to represent stock price gain or drop
			double randNum = (Math.random() * 0.06) - 0.03;
			
			// to ensure that our result only has 2 digits after the decimal point, we need to do the following...
			
			DecimalFormat df = new DecimalFormat("#.##");
			
			// whenever we use DecimalFormat it returns the value as a String
			// we need to then convert the String back to a double
			// we do the new price calculation right in the df.format parameter
			// then use the Double.valueOf() class method to convert the string back to a double
			price = Double.valueOf(df.format((price + randNum)));
			
			
			// this is not the way we should do the following
			// but it isn't critical to the exercise's main objective
			// of featuring the Observation Pattern
			
			switch (stock.toLowerCase())
			{
			case "ibm" : ((StockGrabber)stockGrabber).setIbmPrice(price);
			break;
			
			case "aapl" : ((StockGrabber)stockGrabber).setAaplPrice(price);
			break;
			
			case "goog" : ((StockGrabber)stockGrabber).setGoogPrice(price);
			break;
				
			}
			
			// print out the stock name, new price and price change
			
			String token = ""; // a one character token that will print + if the price change is positive.
			if (randNum>=0) token = "+";
			// this should read something like... GOOG 833.25 +0.03 or AAPL 955.23 -0.01 
			System.out.println(stock.toUpperCase() + ": "+df.format(price)+" " + token + df.format(randNum));
			
			// just print out a blank line to separate the screen output when we call this
			System.out.println();
			
		}

	}
	
	// constructor
	// we will pass an instance of the publisher (stockGrabber) a startTime for the thread
	// the stock name and the stock price
	public GetTheStock(Subject stockGrabber, int startTime, String stock, double price)
	{
		this.stockGrabber = stockGrabber;
		this.startTime = startTime;
		this.stock = stock;
		this.price = price;
	}

}
