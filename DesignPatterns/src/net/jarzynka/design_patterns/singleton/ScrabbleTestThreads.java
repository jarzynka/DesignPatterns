package net.jarzynka.design_patterns.singleton;

public class ScrabbleTestThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable getTiles = new GetTheTiles();
		
		Runnable getTilesAgain = new GetTheTiles();
		
		// start the getTiles Thread
		new Thread(getTiles).start();
		// start the getTilesAgain Thread
		new Thread(getTilesAgain).start();

	}

}
