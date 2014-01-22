package net.jarzynka.design_patterns.factory.abstract_factory;

public class UFOEnemyShipFactory implements IEnemyShipFactory {

	@Override
	public IESWeapon addESWeapon() {
		// TODO Auto-generated method stub
		return new ESUFOGun(); // specific weapon to regular UFOs
	}

	@Override
	public IESEngine addESEngine() {
		// TODO Auto-generated method stub
		return new ESUFOEngine(); // specific engine to regular UFOs
	}

}
