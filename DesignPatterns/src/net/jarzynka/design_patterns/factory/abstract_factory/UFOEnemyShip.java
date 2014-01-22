package net.jarzynka.design_patterns.factory.abstract_factory;

public class UFOEnemyShip extends EnemyShip {
	
	// fields
	IEnemyShipFactory shipFactory; // a reference to whatever factory class is used to build the ship
	
	
	// we need to implement the abstract method to make the ship defined in the parent class "EnemyShip"
	
	void makeShip()
	{
		System.out.println("Making enemy ship "+getName());

		// select the weapon and engine specific to what the selected Factory has ordered!
		weapon = shipFactory.addESWeapon();
		engine = shipFactory.addESEngine();
		
	}
	
	// constructor
	public UFOEnemyShip(IEnemyShipFactory shipFactory)
	{
		this.shipFactory = shipFactory;		
	}

}
