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
		int counter = 0;
		int n = readInt("Enter a number: ");
		
		while (true) {
			
			/* While n is not 1 loop through the whole program to get to 1 */
			while (n != 1) {
				
				/* If n is odd we store the value which results from 3n+1 in nTempOdd to
				 * get the new number to be output in the string. Afterwards we store
				 * nTempOdd into n and break out the while loop to check if the new number
				 * is Odd or Even. Same goes for odd numbers.
				 * While we're doing this we keep track of the process using counter++*/
				if (n % 2 != 0) {
					int nTempOdd = n * 3 + 1;
					println(n + " is odd, so I make 3n+1: " + nTempOdd);
					n = nTempOdd;
					counter++;
					break;
				} else if (n % 2 == 0) {
					int nTempEven = n / 2;
					println(n + " is even so I take half: " + nTempEven);
					n = nTempEven;
					counter++;
					break;
				}
			} if (n == 1) {
				println("This process took " + counter + " to reach 1.");
				break;
			}
		}
	}
}

