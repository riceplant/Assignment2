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
		int firstInput = readInt("? ");
		if (firstInput == SENTINEL) {
			println("Please use 0 as the end of the input.");
		} else {
			max = firstInput;
			min = firstInput;
			while (true) {
				int input = readInt("? ");
				while (input != SENTINEL) {
					if (input > max) {
						max = input;
					} else if (input < max && input > min) {
						min = input;
					} else {
						
					}
				}
			}
		}
		
	}
	private static final int SENTINEL = 0;
}
	
