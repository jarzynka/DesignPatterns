package net.jarzynka.design_patterns.observer;

public interface Observer {
	
	// the Observer class will need to implement these three stock prices
	public void update (double ibmPrice, double aaplPrice, double googPrice);

}
