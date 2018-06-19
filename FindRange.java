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
			if (input == SENTINEL) {
				println("Please use any other number than 0. Use 0 to end your input.");
			}
			while (input != SENTINEL) {
				if (input > SENTINEL) {
					max = input;
					min = input;
				} else {
					max = input;
					min = input;
				}
				if (input > SENTINEL && input > max) {
					max = input;
				} else if (input > SENTINEL && input < max) {
					min = input;
				}
			}
		}
	}
	private static final int SENTINEL = 0;
}
	
