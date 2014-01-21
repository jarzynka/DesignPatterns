package net.jarzynka.design_patterns.factory.factory_basic;

/*
 * This subclass inherits from EnemyShip.
 * At runtime, our client can choose this type of ship from the generic "factory"
 */
public class UFOEnemyShip extends EnemyShip {
	
	// constructor
	public UFOEnemyShip()
	{
		setName("UFO Enemy Ship");
		setAmtDamage(20.0);
	}

}
