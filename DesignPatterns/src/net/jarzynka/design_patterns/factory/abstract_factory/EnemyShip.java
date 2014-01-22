package net.jarzynka.design_patterns.factory.abstract_factory;

public abstract class EnemyShip {
	
	// fields
	private String name;
	IESWeapon weapon; // using an Interface as a field
	IESEngine engine; // aka "Composition"
	
	// getter-setter for name
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	abstract void makeShip(); // abstract method that will need to be implemented by specific ship building classes
	
	// we can override these methods based on our specific ship types
	public void displayEnemyShip()
	{
		System.out.println("The enemy ship "+getName()+" is on the screen!");
		
	}
	
	public void followHeroShip()
	{
		System.out.println("The enemy ship is following our hero at "+engine+"!");
	}
	
	public void enemyShipShoots()
	{
		System.out.println(getName()+" has fired and does "+weapon);
	}
	
	// @Override
	public String toString()
	{
		String infoOnShip = "The "+name+" has a top speed of "+ engine + "and an attack power of "+weapon;
		
		return infoOnShip;
	}
	

}
