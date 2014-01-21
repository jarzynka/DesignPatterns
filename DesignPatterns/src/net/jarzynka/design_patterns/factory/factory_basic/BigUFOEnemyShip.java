package net.jarzynka.design_patterns.factory.factory_basic;

public class BigUFOEnemyShip extends UFOEnemyShip {

	// constructor
		public BigUFOEnemyShip()
		{
			setName("Big UFO Enemy Ship");
			setAmtDamage(40.0); // does more damage - a "boss" ship
		}
	
}
