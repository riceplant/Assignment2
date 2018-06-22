/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;
import java.lang.*;

public class FindRange extends ConsoleProgram {
	
	public void run() {
		int max = 0;
		int min = 0;
		println("This program finds the largest and smallest number.");
		while (true) {
			int input = readInt("? ");
			while (input != SENTINEL) {
				input = readInt("? ");
				if (input == SENTINEL && max == input && min == input) {
					println("Please use 0 to end the user input.");
					break;
				}
				if (input != SENTINEL && input > min && input > max) {
					max = input;
					min = input;
				}
			}
			println("Smallest: " + min);
			println("Largest: " + max);
			break;
		}
	}
	private static final int SENTINEL = 0;
}
	
