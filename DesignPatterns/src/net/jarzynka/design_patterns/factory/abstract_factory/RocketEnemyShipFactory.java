package net.jarzynka.design_patterns.factory.abstract_factory;

public class RocketEnemyShipFactory implements IEnemyShipFactory {

	@Override
	public IESWeapon addESWeapon() {
		// TODO Auto-generated method stub
		return new ESRocketWeapon(); // specific weapon to regular UFOs
	}

	@Override
	public IESEngine addESEngine() {
		// TODO Auto-generated method stub
		return new ESRocketEngine(); // specific engine to regular UFOs
	}

}
