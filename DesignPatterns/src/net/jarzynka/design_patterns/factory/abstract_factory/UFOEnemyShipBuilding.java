package net.jarzynka.design_patterns.factory.abstract_factory;

public class UFOEnemyShipBuilding extends EnemyShipBuilding {

	@Override
	protected EnemyShip makeEnemyShip(String typeOfShip) {

		EnemyShip theEnemyShip = null;
		
		if (typeOfShip.equals("UFO"))
		{
			IEnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
			theEnemyShip = new UFOEnemyShip(shipPartsFactory);
			theEnemyShip.setName("UFO Grunt Ship");
		}
		else if (typeOfShip.equals("UFO BOSS"))
		{
			IEnemyShipFactory shipPartsFactory= new UFOBossEnemyShipFactory();
			theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
			theEnemyShip.setName("UFO Boss Ship");
			
		}
		
		return theEnemyShip;
	}

}
