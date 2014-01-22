package net.jarzynka.design_patterns.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

public class Singleton {

	// fields
	// a static field that holds 
	private static Singleton firstInstance = null;
	
	// an array that contains all of our Scrabble letters
	private String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
				            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
				            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
				            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
				            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
				            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
				            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
				            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",}; 
			
	
	private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));
	
	// a method that holds the first execution of Singleton()
	// uses the Initialization On Demand Holder Idiom Method
	private static class SingletonHolder
	{
		public static final Singleton INSTANCE = new Singleton();
		
	}
	
	// a method that will return the one and only instance of the Singleton class
	public static Singleton getInstance()
	{
		// this is known as lazy instantiation.
		// if it is never needed, it is not created.
		// if it *is* needed, it's created on demand.
		firstInstance =  SingletonHolder.INSTANCE;
		Collections.shuffle(firstInstance.getLetterList());
		
		return firstInstance;
	}
	
	// method that returns all letters in a LinkedList
	public LinkedList<String> getLetterList()
	{
		return firstInstance.letterList;
	}
	
	// method that returns a number of tiles whilst removing them from the original list
	public LinkedList<String> getTiles(int howManyTiles)
	{
		LinkedList<String> tilesToSend = new LinkedList<String>();
		for (int i=0; i< howManyTiles; i++)
		{
			tilesToSend.add(firstInstance.letterList.remove(0));
		}
		
		return tilesToSend;
		
	}
	
	// constructor - private since we don't want calling class to 
	// be able to instantiate directly
	private Singleton() 
	{
		
	}
	
}
