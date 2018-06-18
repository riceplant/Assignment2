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
		int max;
		int min;
		println("This program finds the largest and smallest numbers.");
		while(true) {
			int input = readInt("? ");
			if (input == SENTINEL) {
				println("Your input is not valid since you should use 0 as ending point.");
				break;
			} else {
				max = input;
				min = input;
				if(input == SENTINEL) {
					println("smalest: " + min);
					println("largest: " + max);
				}
			}
		}
		
	}
	/* Specifies the value of the sentinel */
	private static final int SENTINEL = 0;
}

