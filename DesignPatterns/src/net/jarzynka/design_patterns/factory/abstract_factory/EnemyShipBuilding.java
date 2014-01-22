package net.jarzynka.design_patterns.factory.abstract_factory;

/*
 * This class represents the order form that the runtime class will call
 * to pass on to our "middleman" class.
 */
public abstract class EnemyShipBuilding {
	
	protected abstract EnemyShip makeEnemyShip(String typeOfShip);
	
		
	public EnemyShip orderTheShip(String typeOfShip)
	{
		EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);
		
		theEnemyShip.makeShip();
		theEnemyShip.displayEnemyShip();
		theEnemyShip.followHeroShip();
		theEnemyShip.enemyShipShoots();
		
		return theEnemyShip;
	}
	
	
}
