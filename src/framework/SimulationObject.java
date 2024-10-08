package framework;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.LinkedList;

import vectors.Vector;

// Holds methods needed for object

public abstract class SimulationObject {

	protected double x, y;
	protected double xVel, yVel;
	protected double mass;
	protected double r;
	protected Vector vector;
	protected Handler handler;
	
	protected ObjectId id;
	 
	// default
	public SimulationObject() {
		
	}
	
	// block
	public SimulationObject(double x, double y, ObjectId id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	// projectile
	public SimulationObject(double x, double y, double r, double mass, Vector vector, Handler handler, ObjectId id) {
		this.x = x;
		this.y = y;
		this.r = r;
		this.mass = mass;
		this.vector = vector;
		this.id = id;
		this.handler = handler;
	}

	public abstract void update(LinkedList<SimulationObject> object);
	public abstract void render(Graphics2D g2d);
	public abstract Rectangle2D getBounds();
	
	public double getxVel() {
		return xVel;
	}
	
	public void setxVel(double xVel) {
		this.xVel = xVel;
	}
	
	public double getyVel() {
		return yVel;
	}
	
	public void setyVel(double yVel) {
		this.yVel = yVel;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	public double getR() {
		return r;
	}
	
	public double getMass() {
		return mass;
	}

	public void setMass(float mass) {
		this.mass = mass;
	}
	
	public Vector getVector() {
		return vector;
	}
	
	public void setVector(Vector vector) {
		this.vector = vector;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double x2) {
		this.x = x2;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public ObjectId getId() {
		return id;
	}

}
