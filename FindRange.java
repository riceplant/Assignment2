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
		while (true) {
			int input = readInt("? ");
			if (input > 0) {
				max = input;
				min = input; 
				if (input == SENTINEL) {
					println("Smallest: " + min);
					println("Largest: " + max);
				}
			}
		}
	}
	private static final int SENTINEL = 0;
}
	
