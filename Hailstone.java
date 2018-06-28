/*

 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter a number: ");
		
		/* While n is not 1 loop through the whole program to get to 1 */
		while (n != 1) {
			if (n % 2 != 0) {
				int nTemp = n * 3 + 1;
				println(n + " is odd, so I make 3n+1: " + nTemp);
				n = nTemp;
				break;
			} else if (n % 2)
		}
	}
}

