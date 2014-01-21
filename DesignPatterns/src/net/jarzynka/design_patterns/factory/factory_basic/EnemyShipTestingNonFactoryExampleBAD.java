package net.jarzynka.design_patterns.factory.factory_basic;

import java.util.Scanner;

public class EnemyShipTestingNonFactoryExampleBAD {

	public static void main(String[] args) {
		
		// create a new ship of type "UFO"
		// note the data type of our pointer is of type EnemyShip not UFOEnemyShip!
		
		EnemyShip theEnemy = null;
		
		// this is the *non factory* way of coding this!!!
		
		Scanner userInput = new Scanner(System.in);
		
		String enemyShipOption = "";
		
		System.out.println("What type of ship (U/R)?");
		
		if (userInput.hasNextLine()){
			enemyShipOption = userInput.next().toUpperCase();
		}
		
		// the following is a sure sign that a factory method would be preferable
		// a series of IF statements in the runtime code is undesirable.
		// Even though this code is dynamic - it doesn't close the code from being modified - that's bad!
		
		if (enemyShipOption.equals("U"))
		{
			theEnemy = new UFOEnemyShip();
		}
		else if (enemyShipOption.equals("R"))
		{
			theEnemy = new RocketEnemyShip();
		}
		
		doStuffEnemy(theEnemy);
		

	}
	
	// this example method will allow the enemy ship
	// to do some stuff - not really important what! :)
	public static void doStuffEnemy(EnemyShip anEnemyShip)
	{
		anEnemyShip.displayEnemyShip(); // put the ship on the "screen"!
		anEnemyShip.followHeroShip(); // follow the hero ship!
		anEnemyShip.enemyShipShoots(); // shoot at the hero!
	}

}
