//  Eli Geller
//  12/4/24
//  Creates the constructors and methods for the Ball class

import java.awt.*;

public class Ball {
	// your code here!
	
	// don't forget you need instance variables:
	private int size;
	private int x;
	private int y;
	private int xVelocity;
	private int yVelocity;

	// constructor(s):
	public Ball(int x, int y, int size){
		this.x = x;
		this.y = y;
		this.size = size;
	}
	
	// methods:
	
	// getters
	public int getXpos() {
		return x;
	}
	
	public int getYpos() {
		return y;
	}
	
	public int getSize() {
		return size;
	}

	// setters
	public void setXVelocity(int xVel) {
		xVelocity = xVel;
	}
	
	public void setYVelocity(int yVel) {
		yVelocity = yVel;
	}

	public void setX(int newX) {
		x = newX;
	}

	public void setY(int newY) {
		y = newY;
	}

	// xVelocity can't be null
	// if xVelocity is negative, it becomes positive, and vice versa
	public void reverseX() {
		xVelocity *= -1;
	}

	// yVelocity can't be null
	// if yVelocity is negative, it becomes positive, and vice versa
	public void reverseY() {
		yVelocity *= -1;
	}

	// x, y, xVelocity, and yVelocity can't be null
	// adds xVelocity to x, and yVelocity to y so the ball moves when called
	public void move() {
		x += xVelocity;
		y += yVelocity;
	}
	
	// x, y, and size can't be null
	// draws the ball
	public void draw(Graphics g) {
		g.fillOval(x, y, size, size);
	}
}
