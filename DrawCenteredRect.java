/*
 * File: DrawCenteredRect.java
 * Name: 
 * Section Leader: 
 * ----------------------
 * This file is the starter file for the DrawCenteredRect problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class DrawCenteredRect extends GraphicsProgram {
	
	/** Size of the centered rect */
	private static final int WIDTH = 300;
	private static final int HEIGHT = 220;

	public void run() {
		double x = (getWidth() - WIDTH) / 2; // getting the x value which will center the rectangle in the middle of the screen
		double y = (getWidth() - HEIGHT) / 2; // getting the y value which will center the rectangle in the middle of the screen
		GRect rect = new GRect(x, y, WIDTH, HEIGHT);
		rect.setFilled(true);
		rect.setColor(Color.BLUE);
		add(rect);
	}
}

