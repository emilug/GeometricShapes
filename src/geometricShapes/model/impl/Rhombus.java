package geometricShapes.model.impl;

import geometricShapes.model.Shape;

public class Rhombus implements Shape {

	private final double side;
	private final double angle;

	public Rhombus(double side, double angle) {
		this.side = side;
		this.angle = angle;
	}

	@Override
	public double calculateArea() {
		return Math.pow(side, 2) * Math.sin(angle * (Math.PI / 180));
	}

	@Override
	public double calculatePerimeter() {
		return side * 4;
	}

	@Override
	public String getSimpleName() {
		return this.getClass().getSimpleName();
	}

}
