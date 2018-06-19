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
			if (input > max) {
				max = input;
			}
			if (input < min) {
				min = input;
			}
			if (input == SENTINEL && max != 0 && min != 0) {
				println("Smallest: " + min);
				println("Largest: " + max);
			} else if (max == 0 && min == 0) {
					println("You should enter any other number than 0.");
			} else if (input == SENTINEL && max == 0) {
				max = min;
				println("Smallest: " + min);
				println("Largest: " + max);
			} else if (input == SENTINEL && min == 0) {
				min = max;
				println("Smallest: " + min);
				println("Largest: " + max);
			} else {

			
		}
		
		}
		
	}
	/* Specifies the value of the sentinel */
	private static final int SENTINEL = 0;
}