//  Eli Geller
//  12/4/24
//  Creates the constructors and methods for the Paddle class

import java.awt.Graphics;
import java.awt.*;

public class Paddle {
	//your code here!
	
	//don't forget you need instance variables:
	//I didn't forget!
	private int x;
	private int y;
	private int width;
	private int height;
	private int velocity;
	
	//constructor(s):
	public Paddle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	//methods:
	
	//getters
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getVelocity() {
		return velocity;
	}

	//setters
	public void setVelocity(int vel) {
		velocity = vel;
	}

	public void setX(int newX) {
		x = newX;
	}

	// x and velocity can't be null
	// changes the value of x so the ball moves when called
	public void move() {
		x += velocity;
	}

	
	// velocity can't be null
	// adds an amount to velocity
	public void addVelocity(int vel) {
		velocity = vel;
		// set it equal instead of adding it so it's actually playable lol
		// i also changed the addVelocity values in BrickBreak for fun
	}

	// x, y, width, and height can't be null
	// draws the paddle
	public void draw(Graphics g) {
		g.fillRect(x, y, width, height);
	}
}
