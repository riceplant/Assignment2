/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	public void run() {
		int max = 0;
		int min = 0;
		println("This program finds the largest and smallest numbers.");
		int firstInput = readInt("? ");
		while (firstInput != SENTINEL) {
			if (firstInput > 0) {
				max = firstInput;
				min = firstInput;
				int input = readInt("? ");
			} 
			println("Smallest: " + min);
			println("Largest: " + max);
		}		
	}
	/* Specifies the value of the sentinel */
	private static final int SENTINEL = 0;
}