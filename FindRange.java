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
		boolean infiniteInput = true;
		while(infiniteInput) {
			int input = readInt("? ");
			if(input == SENTINEL) {
				println("Please use 0 to end your input.");
				break;
			} else if (input > SENTINEL && input > max) {
				max = input;
			} else if (input > SENTINEL && input > m)
		}
		println("Smallest: " + min);
		println("Largest: " + max);
			
	}
	private static final int SENTINEL = 0;
}
	
