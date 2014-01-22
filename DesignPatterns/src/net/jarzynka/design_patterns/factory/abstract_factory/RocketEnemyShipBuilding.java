package net.jarzynka.design_patterns.factory.abstract_factory;

public class RocketEnemyShipBuilding extends EnemyShipBuilding {

	@Override
	protected EnemyShip makeEnemyShip(String typeOfShip) {

		EnemyShip theEnemyShip = null;
		
			IEnemyShipFactory shipPartsFactory = new RocketEnemyShipFactory();
			theEnemyShip = new RocketEnemyShip(shipPartsFactory);
			theEnemyShip.setName("Rocket Ship: A Flying Missle");
		
		
		return theEnemyShip;
	}

}
