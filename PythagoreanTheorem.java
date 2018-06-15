/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		println("Enter values to compute the Pythagorean theorem.");
		double a = readDouble("a: ");
		double b = readDouble("b: ");
		
		// getting variables for power of 2 
		double a2 = a * a;
		double b2 = b * b; 
		
		// getting the subtraction of a2 and b2
		
		double subtraction = a2 - b2;
		
		double c = Math.sqrt(subtraction);
		println("c = " + c);
	}
}
