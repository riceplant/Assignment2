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
			// If input is not 0
			while (input != SENTINEL) {
				
			// If the first input is 0, then output will be this 
				if (input == SENTINEL) {
					println("Please use any other number than 0. Use 0 to end your input.");
				}
				input = readInt("? ");
				if (input > SENTINEL && input > max) {
					max = input;
				} 
				if (input > SENTINEL && input < max) {
					min = input;
				}
				if (input == SENTINEL) {
					break;
				}
				
			}
			println("Smallest: " + min);
			println("Largest: " + max);
			break;
		}
	}
	private static final int SENTINEL = 0;
}
	
