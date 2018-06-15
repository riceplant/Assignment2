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
	private static final int WIDTH = 350;
	private static final int HEIGHT = 270;

	public void run() {
		double x = (getWidth() -WIDTH)
		GRect rect = new GRect(x, y, WIDTH, HEIGHT);
		rect.setFilled(true);
		rect.setColor(Color.BLUE);
	}
}

