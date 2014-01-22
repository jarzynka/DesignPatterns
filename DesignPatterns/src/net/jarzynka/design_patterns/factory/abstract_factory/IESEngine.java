package net.jarzynka.design_patterns.factory.abstract_factory;

/*
 * This interface defines what each Engine created by any factory must contain
 * in this case a ToString method that will return a short message
 */
public interface IESEngine {
	
	public String toString();

}
