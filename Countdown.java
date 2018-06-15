/*
 * File: Countdown.java
 * Name: 
 * Section Leader: 
 * ----------------------
 * This file is the starter file for the Countdown problem.
 */

import acm.program.*;

public class Countdown extends ConsoleProgram {
	
	/** Count down to 0 from this number */
	private static final int START = 10;

	public void run() {
		for(int i = START; i >= 0; i--) {
			if (i == 0) {
				println("Liftoff");
			} println(i);
		}
	}
}

