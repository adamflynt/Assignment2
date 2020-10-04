/* This will draw a robot face at the center of the graphics window. */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class RobotFace extends GraphicsProgram {
	
// This defines the size of the head parts as constants in pixels.
	private static final int HEAD_WIDTH = 200;
	private static final int HEAD_HEIGHT = 300;
	private static final int EYE_RADIUS = 15;
	private static final int MOUTH_WIDTH = 150;
	private static final int MOUTH_HEIGHT = 30;

// Adds the face at the center of the graphics page.
	public void run() {
		getFace(getWidth () / 2, getHeight() / 2);
	}
		
// Adds the entire face centered and places the eyes and mouth in
// their correct spots.
		private void getFace(double cx, double cy) {
			addHead(cx, cy);
			addEye(cx - HEAD_WIDTH / 4, cy - HEAD_HEIGHT / 4);
			addEye(cx + HEAD_WIDTH / 4, cy - HEAD_HEIGHT / 4);
			addMouth(cx , cy + HEAD_HEIGHT / 4);
		}
		
// Adds the head centered at cx, cy.
		private void addHead(double cx, double cy) {
			double x = cx - HEAD_WIDTH / 2;
			double y = cy - HEAD_HEIGHT / 2;
			GRect head = new GRect(x, y, HEAD_WIDTH, HEAD_HEIGHT);
			head.setFilled(true);
			head.setFillColor(Color.GRAY);
			add(head);
		}
		
// Adds an eye centered at cx, cy.
		private void addEye(double cx, double cy) {
			double x = cx - EYE_RADIUS;
			double y = cy - EYE_RADIUS;
			GOval eye = new GOval(x, y, 2 * EYE_RADIUS, 2 * EYE_RADIUS);
			eye.setFilled(true);
			eye.setFillColor(Color.YELLOW);
			add(eye);
		}
		
// Adds the mouth centered at cx, cy.
		private void addMouth(double cx, double cy) {
			double x = cx - MOUTH_WIDTH / 2;
			double y = cy - MOUTH_HEIGHT / 2;
			GRect mouth = new GRect(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
			mouth.setFilled(true);
			mouth.setFillColor(Color.WHITE);
			add(mouth);
		}
		
}