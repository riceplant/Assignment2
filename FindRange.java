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
			}
		int input = readInt("? ");
		boolean infinity = true;
		while (infinity) {
			input = readInt("? ");
			while (input != SENTINEL) {
				
				/* If input is larger than 0 and larger than min and max */
				if (input > SENTINEL && input > min && input > max) {
					max = input;
				} else if (input > SENTINEL && input > min && input < max) {
					min = input;
				} else if (input < SENTINEL && input < min){
					min = input;
				}
				println("Smallest: " + min);
				println("Largest: " + max);
				break;
			}
		}
		
	}
	private static final int SENTINEL = 0;
}
	
