package net.jarzynka.design_patterns.factory.abstract_factory;

public class UFOBossEnemyShipFactory implements IEnemyShipFactory {

	@Override
	public IESWeapon addESWeapon() {
		// TODO Auto-generated method stub
		return new ESUFOBossGun(); // specific weapon to boss UFOs
	}

	@Override
	public IESEngine addESEngine() {
		// TODO Auto-generated method stub
		return new ESUFOBossEngine(); // specific engine to boss UFOs
	}

}
