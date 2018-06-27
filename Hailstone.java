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
			
			/* if n is odd multiply with 3 and add 1*/
			if (n % 2 != 0) {
				while (n % 2 != 0) {
					int nOdd = 3 * n + 1;
					println(n + " is odd, so I make 3n + 1: " + nOdd);
					n = nOdd;
					break;
				}
				while (n % 2 == 0) {
					int nEven = n / 2;
					println(n + " is even so I take half: " + nEven);
					nEven = n;
					break;
				}
				
			}
			if (n % 2 == 0) {
				while (n % 2 == 0) {
					int nEven = n / 2;
					println(n + " is even so I take half: " + nEven);
					nEven = n;
					break;
				}
				while (n % 2 != 0) {
					int nOdd = 3 * n + 1;
					println(n + " is odd, so I make 3n + 1: " + nOdd);
					n = nOdd;
					break;
				}
			}
		}
	}
}

