package com.mramericanmike.barebones.util;

import java.util.Random;

public class Utilities {

	public Utilities(){}
	
	/**
	 * Returns a random number between the 2 given values
	 * @param min
	 * @param max
	 * @return
	 */
	public static int randInt(int min, int max) {
		return new Random().nextInt((max - min) + 1) + min;
	}

	
}
