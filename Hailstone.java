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
				int nTempOdd = n * 3 + 1;
				println(n + " is odd, so I make 3n+1: " + nTempOdd);
				n = nTempOdd;
				break;
			} else if (n % 2 == 0) {
				int nTempEven = n / 2;
				println(n + "is even so I take half: " + nTempEven);
				n = nTempEven;
			}
		}
	}
}

