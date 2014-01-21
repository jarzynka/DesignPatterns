package net.jarzynka.design_patterns.factory.factory_basic;

/*
 * This is the abstract class, or optionally an Interface, that will provide the base for our "Factory"
 * It's the blueprint of what makes an EnemyShip - but the details of what kind of ship will be 
 * handled by the subclasses of this class.
 */
public abstract class EnemyShip {

	// fields
	private String name; // name of the enemy ship
	private double amtDamage; // amount of damage it can do to the "hero" ship.
	
	// methods
	
	// accessors
	public String getName() { return name; } // get the ship name
	public double getAmtDamage() { return amtDamage; } // get the amount of damage this ship can do
	
	// mutators
	public void setName(String name) { this.name = name; } // set the ship's name
	public void setAmtDamage(double amtDamage) { this.amtDamage = amtDamage; } // set the ship's damage
	
	// sample code that would allow enemy ship to follow the hero ship
	public void followHeroShip()
	{
		System.out.println(getName() + " is following the hero ship!");		
	}
	
	// sample code that would display the enemy ship on screen.
	public void displayEnemyShip()
	{
		System.out.println(getName() + " is on the screen.");		
	}
	
	// sample code that would allow enemy ship to fire on the hero ship
	public void enemyShipShoots()
	{
		System.out.println(getName() + " attacks and does "+ getAmtDamage()+" damage!");		
	}
	
}
