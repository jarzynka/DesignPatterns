package net.jarzynka.design_patterns.factory.factory_basic;

/*
 * This class is our Factory!  It takes the decision making of which enemy ship to choose
 * from the bad runtime example of "EnemyShipTestingNonFactoryBAD" and place it here
 * This encapsulates the decision while still making the ship type dynamic at runtime!
 */
public class EnemyShipFactory {
	
	// a method that will return an EnemyShip object based on the user input
	public EnemyShip makeEnemyShip(String userEntry)
	{
		EnemyShip ship = null; // create an empty reference of type EnemyShip
		
		switch (userEntry.toUpperCase())
		{
			case "U" : ship = new UFOEnemyShip();
			break;
			
			case "R" : ship = new RocketEnemyShip();
			break;
			
			case "B" : ship = new BigUFOEnemyShip();
			break;
		}
		
		
		return ship;
	}

}
