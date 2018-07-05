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
	
	
	public void run() {
		
		/** Set the first brick in the center of the display screen  */
		double x = (getWidth() - BRICK_WIDTH) / 2;
		double y = (getHeight() - BRICK_HEIGHT) / 2;
		
		GRect bricket = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
		bricket.setFilled(false);
		add(bricket);
		
		/** set the x-coordinate that it will be at the half of the brick*/
		double x2 = (getWidth() - BRICK_WIDTH * 2) / 2; 
		
		/** set the y-coordinate that it will be set at the bottom of the brick*/
		double y2 = (getHeight() - BRICK_HEIGHT * 3) / 2;
		
		GRect bricket2 = new GRect(x2, y2, BRICK_WIDTH, BRICK_HEIGHT);
		bricket.setFilled(true);
		add(bricket2);
		
		for (int i = 2; i < BRICKS_IN_BASE; i++) {
			double x3 = (getWidth() - BRICK_WIDTH * i) 
		}
		
	}
}

