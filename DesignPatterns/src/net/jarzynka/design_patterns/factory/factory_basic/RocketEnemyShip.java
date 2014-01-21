package net.jarzynka.design_patterns.factory.factory_basic;

/*
 * This subclass inherits from EnemyShip.
 * At runtime, our client can choose this type of ship from the generic "factory"
 */
public class RocketEnemyShip extends EnemyShip {
	
	// constructor
	public RocketEnemyShip()
	{
		setName("Rocket Enemy Ship");
		setAmtDamage(10.0); // this ship is faster but doesn't do as much damage as others
	}

}
