package net.jarzynka.design_patterns.factory.factory_basic;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {
		
		// create a new ship of type "UFO"
		// note the data type of our pointer is of type EnemyShip not UFOEnemyShip!
		
		EnemyShip theEnemy = null;
		
		// create an instance of the Factory class
		// we'll call this to create our requested type of EnemyShip!
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		
		// this is the *non factory* way of coding this!!!
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What type of ship (U/R/B)?");
		
		String typeOfShip = "";
		
		if (userInput.hasNextLine()){
			typeOfShip = userInput.next().toUpperCase();
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
			
		}
				
		if (theEnemy != null)
			{
			doStuffEnemy(theEnemy);
			}
		else
		{
			System.out.println("Type of ship \""+typeOfShip+ "\" not recognized by system.");
			System.out.println("Enter a \"U\", \"R\" or \"B\" next time, please!");
		}
		
		userInput.close(); // make sure we close our input stream!  Bad Banas missed this!
		

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
