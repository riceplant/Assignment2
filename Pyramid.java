/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Height of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	
	private double startingX = 0;
	private double startingY = 0;
	private double bricksLeft = BRICKS_IN_BASE;
	
	public void run() {
		
		startingX = getWidth() / 2 - (bricksLeft * BRICK_WIDTH) / 2;
		startingY = getHeight() - BRICK_HEIGHT;
		
		for (int row = 0; row < BRICKS_IN_BASE; row++) {
			
			for (int col = 0; col < bricksLeft; col++) {
				
				GRect brick = new GRect(row, col, BRICK_WIDTH, BRICK_HEIGHT)
			}
		}
		
	}
}

