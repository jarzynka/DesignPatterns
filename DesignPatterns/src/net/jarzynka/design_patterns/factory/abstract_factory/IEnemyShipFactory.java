package net.jarzynka.design_patterns.factory.abstract_factory;

/*
 * This Interface defines what every Ship building Factory must do
 * In this case, add an Engine and add a Weapon
 * In turn, both Weapons and Engines are themselves defined by Interfaces: IESWeapon and IESEngine
 * 
 */

public interface IEnemyShipFactory {
	
	public IESWeapon addESWeapon();
	public IESEngine addESEngine();

}
