package net.jarzynka.design_patterns.factory.abstract_factory;

public class EnemyShipTestingRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// we need only to decide if we need to call an alien ship that will be a UFO or Rocket
		
		EnemyShipBuilding shipOrder = new UFOEnemyShipBuilding(); // this ship will be a UFO
		//shipOrder.orderTheShip("UFO Boss");
		
		// we need to decide *what* type of UFO it will be: grunt or boss
		
		EnemyShip theGrunt = shipOrder.orderTheShip("UFO");
		System.out.println(theGrunt);
		
		System.out.println();
		
		EnemyShip theBoss = shipOrder.orderTheShip("UFO BOSS");
		System.out.println(theBoss);
		
		System.out.println();
		
		shipOrder = new RocketEnemyShipBuilding();
		
		EnemyShip theRocket = shipOrder.orderTheShip(""); // the entry string doesn't matter here
		System.out.println(theRocket);
		

	}

}
